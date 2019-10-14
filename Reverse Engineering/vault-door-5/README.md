# vault-door-5
Points: 300
## Category
Reverse Engineering
## Problem Statement
> In the last challenge, you mastered octal (base 8), decimal (base 10), and hexadecimal (base 16) numbers, but this vault door uses a different change of base as well as URL encoding! The source code for this vault is here: [VaultDoor5.java](VaultDoor5.java)
## Hints
> You may find an encoder/decoder tool helpful, such as https://encoding.tools/
> Read the wikipedia articles on URL encoding and base 64 encoding to understand how they work and what the results look like.
## Solution
When we look at the `checkPassword` function in this file, we see that all it is oding is passing the string through a URL Ecndoing and then a base64 encoding. While it is possible to do reverrse this with programming, it is much more simple to just use online tools. We first pass it through a base64 decoder like [base64decode](https://www.base64decode.org/) and then a URL decoder like [URL Decoder](https://www.urldecoder.org/) and voila! Our flag is revealed.
## Flag
`picoCTF{c0nv3rt1ng_fr0m_ba5e_64_db6946ba}`