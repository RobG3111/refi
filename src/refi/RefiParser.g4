parser grammar RefiParser;

@header 
{
package refi;
}

options 
{ 
    caseInsensitive=true; 
    tokenVocab=RefiLexer;
}

expression:
    (matcher)+ EOF;

backeted_matcher:
    LEFTPAREN matcher+ RIGHTPAREN;    

matcher:
    backeted_matcher | 
	anywild |
    bell | 
    bol     |
    backtick |
    capture_matcher | 
    caseins |
    caseinsoff |
    char |
    ctrl_matcher |
    digit |
    either_matcher | 
    eol     |
    escape |
    expr_param_matcher | 
    formfeed |
    flags |
    hex_matcher | 
    newline |
    nondigit |
    not_matcher |
    octal_matcher | 
    or_matcher | 
    range_matcher |
    return |
    string |
    function_matcher | 
    tab | 
    unicodecase |
    unixlines | 
    wild |
    wordboundary;
    
literal_matcher:
	backtick |
    backeted_matcher |
	wild ;   

capture_matcher:
    CAPTURE LEFTCURLY (matcher | backeted_matcher)+? (COMMA name=(STRING | CHAR))? RIGHTCURLY;

caseins: CASEINS;

caseinsoff: CASEINSOFF;

char: CHAR;

ctrl_matcher:
    CTRL LEFTCURLY INT RIGHTCURLY;  

either_matcher:
    EITHER LEFTCURLY CHAR COMMA CHAR (COMMA CHAR)* RIGHTCURLY;
    
expr_param_matcher:
    matcher_name LEFTCURLY expr=literal_matcher* RIGHTCURLY;

flags:
    FLAGS LEFTCURLY name1=flagname (COMMA names+=flagname)*? RIGHTCURLY;

hex_matcher:
    HEX LEFTCURLY number=HEX_NUMBER RIGHTCURLY;

nondigit:
    NONDIGIT;

not_matcher:
    NOT LEFTCURLY CHAR COMMA CHAR (COMMA CHAR)* RIGHTCURLY;
  
octal_matcher:
    OCTAL LEFTCURLY OCTAL_NUMBER RIGHTCURLY;

or_matcher:
    OR LEFTCURLY matcher+? VERTICAL matcher+? RIGHTCURLY;
    
range_matcher:
    RANGE LEFTCURLY CHAR COLON CHAR (COMMA CHAR COLON CHAR)? RIGHTCURLY;

string:
    STRING;

function_matcher:
    matcher_name LEFTCURLY str=(STRING | CHAR) RIGHTCURLY ;

matcher_name :
    ANY |
    OPTIONAL |
    SOME ;


anywild :  ANYWILD;

backtick : BACKTICK;

bell : BELL;

bol : BOL;

digit : DIGIT;

escape : ESCAPE;

eol : EOL;

flagname : CASEINS | CASEINSOFF | UNICODECASE | UNIXLINES;

formfeed : FORMFEED;

newline : NEWLINE;  

return : RETURN;

tab : TAB;

unicodecase : UNICODECASE;

unixlines : UNIXLINES;

wild : WILD;

wordboundary:
    WORDBOUNDARY;
