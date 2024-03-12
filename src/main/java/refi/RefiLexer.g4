lexer grammar RefiLexer;

options 
{ 
    caseInsensitive=true; 
}

@header 
{
package refi;
}

fragment BACKTICK_CHAR : '`';

CHAR      : BACKTICK_CHAR ~'`' BACKTICK_CHAR; 

COLON       : ':';

COMMA       : ',';

fragment HEX_DIGIT : [0-9ABCDEF];

HEX_NUMBER : '0x' HEX_DIGIT? HEX_DIGIT;

INT         : [0-9][0-9]*;

LEFTCURLY   : '{';

LEFTPAREN   : '(';

OCTAL_NUMBER : [0-3]?[0-7]?[0-7];

RIGHTCURLY  : '}';

RIGHTPAREN  : ')';

STRING      : BACKTICK_CHAR ~'`' (~'`')+ BACKTICK_CHAR;  

VERTICAL    : '|';

WS          : [ \r\n\t]+ -> skip;

ALPHABETIC : 'alphabetic';

ATLEAST : 'atleast';

ANY : 'any';

ANYWILD : 'anywild';

ASCII : 'ascii';

BACKTICK : 'backtick';

BELL : 'bell';

BETWEEN : 'between';

BOL : 'bol';

CAPTURE : 'capture';

CASEINS : 'caseins';

CASEINSOFF : 'caseinsoff';

COMMENTS : 'Comments';

CTRL : 'ctrl';

CURRENCY : 'currency';

DIGIT : 'digit';

DOTALL : 'DotAll'; 

EITHER : 'either';

ESCAPE : 'escape';

EOL : 'eol';

EXACTLY : 'exactly';

FLAGGED : 'flagged';

FLAGS : 'flags';

FORMFEED : 'formfeed';

GREEK : 'greek';

HEX : 'hex';

LATIN : 'latin';

LOWER : 'lower';

MULTILINE : 'MultiLine'; 

NEWLINE : 'newline';  

NONDIGIT : 'nondigit';

NOT : 'not';

OCTAL : 'octal';

OPTIONAL : 'optional';

OR : 'or';

POSSES : 'posses';

RANGE : 'range';

RELUCT : 'reluct';

RETURN : 'return';

SOME : 'some';

SOMESPACE : 'somespace';

TAB : 'tab';

UNICODECASE : 'UnicodeCase';

UNICODECASEOFF : 'UnicodeCaseOff';

UNION : 'union';

UNIXLINES : 'UnixLines';

UNIXLINESOFF : 'UnixLinesOff';

UPPER : 'upper';

WILD : 'wild';

WORDBOUNDARY : 'wordboundary';

ZZ : 'zz';
