# vault-door-6
Points: 350
## Category
Reverse Engineering
## Problem Statement
> This vault uses an XOR encryption scheme. The source code for this vault is here: [VaultDoor6.java](VaultDoor6.java)
## Hints
> If X ^ Y = Z, then Z ^ Y = X. Write a program that decrypts the flag based on this fact.
## Solution
XOR means exclusive or, although we don't really need to throuoghly to solve this one. As the hint tells us, if X ^ Y = Z, then Z ^ Y = X. We see in the `checkPassword` function that each byte is equal to each byte in the password XOR 0x55 (The caret ^ operator in Java means XOR). To reverse this, we simply XOR 0x55 every single byte returned and convert it to ASCII, as seen in this [Java file](vault6.java).
## Flag
`picoCTF{n0t_mUcH_h4rD3r_tH4n_x0r_57c2892}`