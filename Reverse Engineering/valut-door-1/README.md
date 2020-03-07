# vault-door-training
Points: 100
## Category
Reverse Engineering
## Problem Statement
> This vault uses some complicated arrays! I hope you can make sense of it, special agent. The source code for this vault is here: [VaultDoor1.java](VaultDoor1.java)
## Hints
> Look up the charAt() method online.
## Solution
Similarily to vault-door-training, we are faced with a `checkPassword` function. Except this time, it seperates the string into characters. The `charAt()` method in Java returns the character in a given index on a string. If we find the characters in order of the indices revealed by the `charAt()  ` methods, we can find the flag manually. We know that there should only be 32 (from 0 to 31) methods as the fucntion also checks that the length of the string is 32, so we can stop once we reach `charAt(31)`.
## Flag
`picoCTF{d35cr4mbl3_tH3_cH4r4cT3r5_03f841}`