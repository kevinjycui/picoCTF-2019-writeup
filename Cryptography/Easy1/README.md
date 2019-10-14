# Easy1
Points: 100
## Category
Cryptography
## Problem Statement
> The one time pad can be cryptographically secure, but not when you know the key. Can you solve this? We've given you the encrypted flag, key, and a table to help `UFJKXQZQUNB` with the key of `SOLVECRYPTO`. Can you use this [table](table.txt) to solve it?.
## Hints
> Submit your answer in our competition's flag format. For example, if you answer was 'hello', you would submit 'picoCTF{HELLO}' as the flag.
> Please use all caps for the message.
## Solution
A key and a double-entry table immediatly clues us to one of the most common encryption methods: the Vigenère cipher. While there are ways to decrypt messages with this cipher manually (using the table in the given text file), it is much easier to solve it with on online tool such as [DCODE](https://www.dcode.fr/vigenere-cipher).
## Flag
`picoCTF{CRYPTOISFUN}`