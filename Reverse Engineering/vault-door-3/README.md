# vault-door-3
Points: 200
## Category
Reverse Engineering
## Problem Statement
> This vault uses for-loops and byte arrays. The source code for this vault is here: [VaultDoor3.java](VaultDoor3.java)
## Hints
> Make a table that contains each value of the loop variables and the corresponding buffer index that it writes to.
## Solution
For some reason the devs of picoCTF skipped vault-door-2 so here we are at vault-door-3. We can see in the `checkPassword` function that the program takes in a string s and scarmble the characters around in an array where it then converts it back into a string. We could do this manually, or just literally reverse what the function is doing by looping backwards and scrambling the returned string backwards as seen in this [Java file that I wrote](vault3.java).
## Flag
`picoCTF{jU5t_a_s1mpl3_an4gr4m_4_u_c08866}`