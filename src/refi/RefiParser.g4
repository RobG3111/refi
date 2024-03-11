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
    atleast |
    backeted_matcher | 
    between |
    alphabetic |
	anywild |
    bell | 
    bol     |
    backtick |
    capture_matcher | 
    caseins |
    caseinsoff |
    char |
    ctrl_matcher |
    currency | 
    digit |
    either_matcher | 
    eol     |
    escape |
    exactly |
    expr_param_matcher | 
    formfeed |
    flagged |
    flags |
    greek |
    hex_matcher | 
    latin |
    newline |
    nondigit |
    not_matcher |
    octal_matcher | 
    or_matcher | 
    range_matcher |
    return |
    somespace |
    string |
    tab | 
    unicodecase |
    unicodecaseoff |
    union | 
    unixlines | 
    unixlinesoff |
    upper | 
    wild |
    wordboundary;
    
literal_matcher:
	backtick |
    backeted_matcher |
	wild ;   

atleast:
    ATLEAST LEFTCURLY count=INT COMMA (matcher | backeted_matcher) RIGHTCURLY;
    
between:
    BETWEEN LEFTCURLY from=INT COMMA to=INT COMMA (matcher | backeted_matcher) RIGHTCURLY;

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
    matcher_name LEFTCURLY matcher (COMMA matchType=match_type)? RIGHTCURLY;

exactly : 
    EXACTLY LEFTCURLY count=INT COMMA (matcher | backeted_matcher) RIGHTCURLY;

flagged:
    FLAGGED LEFTCURLY names+=flagname (COMMA names+=flagname)*? COMMA (matcher | backeted_matcher) RIGHTCURLY;

flags:
    FLAGS LEFTCURLY names+=flagname (COMMA names+=flagname)*? RIGHTCURLY;

greek : GREEK;

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

union:
    UNION LEFTCURLY CHAR COLON CHAR COMMA CHAR COLON CHAR RIGHTCURLY;

string:
    STRING;

matcher_name :
    ANY |
    OPTIONAL |
    SOME ;

match_type : 
    POSSES |
    RELUCT;


alphabetic : ALPHABETIC;

anywild :  ANYWILD;

backtick : BACKTICK;

bell : BELL;

bol : BOL;

currency : CURRENCY;

digit : DIGIT;

escape : ESCAPE;

eol : EOL;

flagname : CASEINS | CASEINSOFF | UNICODECASE | UNICODECASEOFF | UNIXLINES | UNIXLINESOFF;

formfeed : FORMFEED;

latin : LATIN;

newline : NEWLINE;  

return : RETURN;

somespace : SOMESPACE;

tab : TAB;

unicodecase : UNICODECASE;

unicodecaseoff : UNICODECASEOFF;

unixlines : UNIXLINES;

unixlinesoff : UNIXLINESOFF;

upper : UPPER;

wild : WILD;

wordboundary:
    WORDBOUNDARY;
