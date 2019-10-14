# Bases
Points: 100
## Category
General Skills
## Problem Statement
> What does this `bDNhcm5fdGgzX3IwcDM1` mean? I think it has something to do with bases.
## Hints
> Submit your answer in our competition's flag format. For example, if you answer was 'hello', you would submit 'picoCTF{hello}' as the flag.
## Solution
The problem title and statement hints to us that this is another base conversion problem. A jumble of characters and numbers signifies that this is a value with a very high base. We can try to decode this with a common large base such as base64, which gets us our flag. The easiest way to tackle it is to just put it through a base conversion online site such as [RapidTables](https://www.rapidtables.com/convert/number/decimal-to-binary.html).
## Flag
`picoCTF{l3arn_th3_r0p35}`