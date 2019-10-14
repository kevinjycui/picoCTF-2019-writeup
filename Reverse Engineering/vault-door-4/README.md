# vault-door-4
Points: 250
## Category
Reverse Engineering
## Problem Statement
> This vault uses ASCII encoding for the password. The source code for this vault is here: [VaultDoor4.java](VaultDoor4.java)
## Hints
> Use a search engine to find an "ASCII table".
> You will also need to know the difference between octal, decimal, and hexademical numbers.
## Solution
Here we see another `checkPassword` function, this time as an array of bytes with different bases. The solution is as simple as converting them all to base 10 and then ASCII using Java's `Byte.toString()` method to convert the bytes into strings of base 10, then using `Inetegr.parseInt()` to convert that String to an int and then casting the int to a char to get the ASCII value. I do all of this in this [Java file](vault4.java).
## Flag
`picoCTF{jU5t_4_bUnCh_0f_bYt3s_7a1c8c668b}`