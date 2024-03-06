REFI is Regular Expressions For Idiots.

AKA long form regular expressions.

This is a library that allows regular expressions to be written using more comprehensible tokens instead of special characters. The library converts the tokens into a usual regular expression that other tools can use.

For example the REFI expression

  wild some{\`a\`} digit

translates to

  .a+\d

In this example wild means a wildcard character, some{\`a\`} means one of more of the a character and digit means a digit character. In REFI strings are enclosed in back ticks and there are no escape characters. To denote the backtick character use the backtick token. Consecutive strings are allowed so you can easily split long strings over multipe lines by closing the string on one line and starting another one on the next line.

REFI is in the very early stages of development so only some the tokens are defined in the grammar and implemented. REFI uses an Antlr4 grammar to create the translator. At the moment there is only a Java implemetation because I'm an old Java programmer. 

Grammar


| Keyword                               | Implemented | Reg ex feature                                                                                                             |
|---------------------------------------|-------------|----------------------------------------------------------------------------------------------------------------------------|
| \`x\`                                   | yes         | x The character x                                                                                                          |
| octal{nnn}                            | yes         | \0n The character with octal value 0n (0 <= n <= 7)                                                                        |
|                                       |             | \0nn The character with octal value 0nn (0 <= n <= 7)                                                                      |
|                                       |             | \0mnn The character with octal value 0mnn (0 <= m <= 3, 0 <= n <= 7)                                                       |
| hex{0xhh}                             | yes         | \xhh The character with hexadecimal value 0xhh                                                                             |
|                                       |             | \uhhhh The character with hexadecimal value 0xhhhh                                                                         |
| hex{0xhh, 0xhh}                       |             | \x{h...h} The character with hexadecimal value 0xh...h (Character.MIN_CODE_POINT  <= 0xh...h <=  Character.MAX_CODE_POINT) |
| tab                                   | yes         | \t The tab character ('\u0009')                                                                                            |
| newline                               | yes         | \n The newline (line feed) character ('\u000A')                                                                            |
| return                                | yes         | \r The carriage-return character ('\u000D')                                                                                |
| formfeed                              | yes         | \f The form-feed character ('\u000C')                                                                                      |
| bell                                  | yes         | \a The alert (bell) character ('\u0007')                                                                                   |
| escape                                | yes         | \e The escape character ('\u001B')                                                                                         |
| ctrl{x}                               | yes         | \cx The control character corresponding to x                                                                               |
| backtick                              | yes         | backtick character \`                                                                                                       |
|                                       |             |                                                                                                                            |
| either{\`a\`, \`b\`, \`c\`}                 | yes         | [abc] a, b, or c (simple class)                                                                                            |
| not{\`a\`, \`b\`, \`c\`}                    | yes         | [^abc] Any character except a, b, or c (negation)                                                                          |
| range{\`a\`:\`z\`, \`A\`:\`Z\`}               | yes         | [a-zA-Z] a through z or A through Z, inclusive (range)                                                                     |
| union{r1, r2}                         |             | [a-d[m-p]] a through d, or m through p: [a-dm-p] (union)                                                                   |
| intersect{r1, r2}                     |             | [a-z&&[def]] d, e, or f (intersection)                                                                                     |
|                                       |             | [a-z&&[^bc]] a through z, except for b and c: [ad-z] (subtraction)                                                         |
|                                       |             | [a-z&&[^m-p]] a through z, and not m through p: [a-lq-z](subtraction)                                                      |
|                                       |             |                                                                                                                            |
| wild                                  | yes         | . Any character (may or may not match line terminators)                                                                    |
| digit                                 | yes         | \d A digit: [0-9]                                                                                                          |
| nondigit                              | yes         | \D A non-digit: [^0-9]                                                                                                     |
| whitehoriz                            |             | \h A horizontal whitespace character: [ \t\xA0\u1680\u180e\u2000-\u200a\u202f\u205f\u3000]                                 |
| whitenonhoriz                         |             | \H A non-horizontal whitespace character: [^\h]                                                                            |
| whitespace                            |             | \s A whitespace character: [ \t\n\x0B\f\r]                                                                                 |
| nonwhitespace                         |             | \S A non-whitespace character: [^\s]                                                                                       |
| vertwhitespace                        |             | \v A vertical whitespace character: [\n\x0B\f\r\x85\u2028\u2029]                                                           |
| vertnonwhitespace                     |             | \V A non-vertical whitespace character: [^\v]                                                                              |
| wordchar                              |             | \w A word character: [a-zA-Z_0-9]                                                                                          |
| nonwordchar                           |             | \W A non-word character: [^\w]                                                                                             |
|                                       |             |                                                                                                                            |
| lower                                 |             | \p{Lower} A lower-case alphabetic character: [a-z]                                                                         |
| upper                                 |             | \p{Upper} An upper-case alphabetic character:[A-Z]                                                                         |
| ascii                                 |             | \p{ASCII} All ASCII:[\x00-\x7F]                                                                                            |
| alphabetic                            |             | \p{Alpha} An alphabetic character:[\p{Lower}\p{Upper}]                                                                     |
| decimal                               |             | \p{Digit} A decimal digit: [0-9]                                                                                           |
| alphanumeric                          |             | \p{Alnum} An alphanumeric character:[\p{Alpha}\p{Digit}]                                                                   |
| punct                                 |             | \p{Punct} Punctuation: One of !"#$%&'  *+,-./:<=>?@[\]^_\`{\|}                                                              |
| visible                               |             | \p{Graph} A visible character: [\p{Alnum}\p{Punct}]                                                                        |
| printable                             |             | \p{Print} A printable character: [\p{Graph}\x20]                                                                           |
| blank                                 |             | \p{Blank} A space or a tab: [ \t]                                                                                          |
| control                               |             | \p{Cntrl} A control character: [\x00-\x1F\x7F]                                                                             |
| hexdigit                              |             | \p{XDigit} A hexadecimal digit: [0-9a-fA-F]                                                                                |
| space                                 |             | \p{Space} A whitespace character: [ \t\n\x0B\f\r]                                                                          |
|                                       |             |                                                                                                                            |
|                                       |             |                                                                                                                            |
| latin                                 |             | \p{IsLatin} A Latin script character (script)                                                                              |
| greek                                 |             | \p{InGreek} A character in the Greek block (block)                                                                         |
| upperletter                           |             | \p{Lu} An uppercase letter (category)                                                                                      |
| alphabetic                            |             | \p{IsAlphabetic} An alphabetic character (binary property)                                                                 |
| currency                              |             | \p{Sc} A currency symbol                                                                                                   |
| nongreek                              |             | \P{InGreek} Any character except one in the Greek block (negation)                                                         |
| nonupper                              |             | [\p{L}&&[^\p{Lu}]] Any letter except an uppercase letter (subtraction)                                                     |
|                                       |             |                                                                                                                            |
| bol                                   | yes         | ^ The beginning of a line                                                                                                  |
| eol                                   | yes         | $ The end of a line                                                                                                        |
| wordboundary                          | yes         | \b A word boundary                                                                                                         |
| nonwordboundy                         |             | \B A non-word boundary                                                                                                     |
| begininput                            |             | \A The beginning of the input                                                                                              |
| endmatch                              |             | \G The end of the previous match                                                                                           |
| endinputexcept                        |             | \Z The end of the input but for the final terminator, if any                                                               |
| endinput                              |             | \z The end of the input                                                                                                    |
|                                       |             |                                                                                                                            |
| linebreak                             |             | \R Any Unicode linebreak sequence, is equivalent to \u000D\u000A\|[\u000A\u000B\u000C\u000D\u0085\u2028\u2029]             |
|                                       |             |                                                                                                                            |
| optional{x}                           | yes         | X? X, once or not at all                                                                                                   |
| any{x}                                | yes         | X* X, zero or more times                                                                                                   |
| some{x}                               | yes         | X+ X, one or more times                                                                                                    |
| exactly{x, n}                         |             | X{n} X, exactly n times                                                                                                    |
| atleast{x, n}                         |             | X{n,} X, at least n times                                                                                                  |
| atleast{x, n, m}                      |             | X{n,m} X, at least n but not more than m times                                                                             |
|                                       |             |                                                                                                                            |
| optional{x, reluct}                   |             | X?? X, once or not at all                                                                                                  |
| any{x, reluct}                           |             | X*? X, zero or more times                                                                                                  |
| some{x, reluct}                          |             | X+? X, one or more times                                                                                                   |
| exactly{x, n, reluct}                    |             | X{n}? X, exactly n times                                                                                                   |
| atleast{x, n, reluct}                    |             | X{n,}? X, at least n times                                                                                                 |
| atleast{x, n, m, reluct}                 |             | X{n,m}? X, at least n but not more than m times                                                                            |
|                                       |             |                                                                                                                            |
| optional{x, posses}                   |             | X?+ X, once or not at all                                                                                                  |
| any{x, posses}                           |             | X*+ X, zero or more times                                                                                                  |
| some{x, posses}                          |             | X++ X, one or more times                                                                                                   |
| exactly{x, n, posses}                    |             | X{n}+ X, exactly n times                                                                                                   |
| atleast{x, n, posses}                    |             | X{n,}+ X, at least n times                                                                                                 |
| atleast{x, n, m, posses}                 |             | X{n,m}+ X, at least n but not more than m times                                                                            |
|                                       |             |                                                                                                                            |
| \`x\` \`y\`                               |             | XY X followed by Y                                                                                                         |
| or{\`x\` \|  \`y\`}                       |             | X\|Y Either X or Y                                                                                                         |
| capture{x}                            | yes | (X) X, as a capturing group                                                                                                |
| capture{x, "name"}                    | yes           | (?<name>X) X, as a named-capturing group                                                                                   |
|                                       |             |                                                                                                                            |
| group{n}                              |             | \n Whatever the nth capturing group matched                                                                                |
| group{"name"}                         |             | \k<name> Whatever the named-capturing group "name" matched                                                                 |
|                                       |             |                                                                                                                            |
|                                       |             | \ Nothing, but quotes the following character                                                                              |
|                                       |             | \Q Nothing, but quotes all characters until \E                                                                             |
|                                       |             | \E Nothing, but ends quoting started by \Q                                                                                 |
|                                       |             |                                                                                                                            |
|                                       |             | (?<name>X) X, as a named-capturing group                                                                                   |
|                                       |             | (?:X) X, as a non-capturing group                                                                                          |
| UnixLines CaseIns Comments            |             | (?idmsuxU-idmsuxU)  Nothing, but turns match flags i d m s u x U on - off                                                  |
| MultiLine DotAll UnicodeCase          |             |                                                                                                                            |
| CanonEq UnicodeCharClass              |             |                                                                                                                            |
| UnixLinesOff CaseInsOff CommentsOff   |             |                                                                                                                            |
| MultiLineOff DotAllOff UnicodeCaseOff |             |                                                                                                                            |
| CanonEqOff UnicodeCharClassOff        |             |                                                                                                                            |
| flags{ flag , flag, …}                |             |                                                                                                                            |
|                                       |             |                                                                                                                            |
| flagged{ flag, flag, …, expression}   |             | (?idmsux-idmsux:X)   X, as a non-capturing group with the given flags i d m s u x on - off                                 |
|                                       |             | (?=X) X, via zero-width positive lookahead                                                                                 |
|                                       |             | (?!X) X, via zero-width negative lookahead                                                                                 |
|                                       |             | (?<=X) X, via zero-width positive lookbehind                                                                               |
|                                       |             | (?<!X) X, via zero-width negative lookbehind                                                                               |
|                                       |             | (?>X) X, as an independent, non-capturing group                                                                            |
|                                       |             |                                                                                                                            |
| anyspace                              |             | any(space)                                                                                                                 |
| anywild                               | yes         | any(wild)                                                                                                                  |
| somespace                             |             | some(space)                                                                                                                |
| caseins{x}                            |             | X\|x                                                                                                                       |
|                                       |             |                                                                                                                            |
| Examples                              |             |                                                                                                                            |
|                                       |             |                                                                                                                            |
|                                       |             | bol capture( somespace \`cat\` somespace ) eol ->   ^( +cat +)$                                                              |
|                                       |             | caseins(\`F\`) \`red\`                                  ->   F\|fred                                                           |
|                                       |             | \`F\` or \`f\` \`red\`                                    ->   F\|fred                                                           |
|                                       |             | some(digit)                                         ->   [0-9]+                                                            |
|                                       |             | some(range(\`0\`:\`9\`))                                ->   [0-9]+                                                            |
|                                       |             |                                                                                                                            |
