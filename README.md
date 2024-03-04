REFI is Regular Expressions For Idiots.

AKA long form regular expressions.

This is a library that allows regular expressions to be written using more comprehensible tokens instead of special characters. The library converts the tokens into a usual regular expression that other tools can use.

For example the REFI expression

  wild some{`a`} digit

translates to

  .a+\d

In this example wild means a wildcard character, some{`a`} means one of more of the a character and digit means a digit character. In REFI strings are enclosed in back ticks and there are no escape characters. To denote the backtick character use the backtick token. Consecutive strings are allowed so you can easily split long strings over multipe lines by closing the string on one line and starting another one on the next line.

REFI is in the very early stages of development so only some the tokens are defined in the grammar and implemented. REFI uses an Antlr4 grammar to create the translator. At the moment there is only a Java implemetation because I'm an old Java programmer.  
