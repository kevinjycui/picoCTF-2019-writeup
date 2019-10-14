# la cifra de
Points: 200
## Category
Cryptography
## Problem Statement
> I found this cipher in an old book. Can you figure out what it says? Connect with `nc 2019shell1.picoctf.com 61559`.
## Hints
> There are tools that make this easy.
> Perhaps looking at history will help
## Solution
The hint for this one may seem obscure, but once again it is the common Vigenère cipher. If you didn;t know, the original publication of this cipher was in a book called "*La cifra del Sig. Giovan Battista Bellaso*", hence the title. You may find that there is a key like expression in the plain-text returned after you connect to the host. Put that into an online cipher such as [DCODE](https://www.dcode.fr/vigenere-cipher). This time, we do not have the key, but we know an expected plain-text word is picoCTF. SImply put that in as the decryption method, and have the flag given to you.
## Flag
`picoCTF{b311a50_0r_v1gn3r3_c1ph3rb6cdf651}`