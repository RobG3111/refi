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

ANY : 'any';

ANYWILD : 'anywild';

BACKTICK : 'backtick';

BELL : 'bell';

BOL : 'bol';

CAPTURE : 'capture';

CASEINS : 'caseins';

CASEINSOFF : 'caseinsoff';

COMMENTS : 'Comments';

CTRL : 'ctrl';

DIGIT : 'digit';

DOTALL : 'DotAll'; 

EITHER : 'either';

ESCAPE : 'escape';

EOL : 'eol';

FLAGS : 'flags';

FORMFEED : 'formfeed';

HEX : 'hex';

MULTILINE : 'MultiLine'; 


NEWLINE : 'newline';  

NONDIGIT : 'nondigit';

NOT : 'not';

OCTAL : 'octal';

OPTIONAL : 'optional';

OR : 'or';

RANGE : 'range';

RETURN : 'return';

SOME : 'some';

TAB : 'tab';

UNICODECASE : 'UnicodeCase';

UNIXLINES : 'UnixLines';

WILD : 'wild';

WORDBOUNDARY : 'wordboundary';

ZZ : 'zz';
