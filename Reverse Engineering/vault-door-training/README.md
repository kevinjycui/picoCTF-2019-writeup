# vault-door-training
Points: 50
## Category
Reverse Engineering
## Problem Statement
> Your mission is to enter Dr. Evil's laboratory and retrieve the blueprints for his Doomsday Project. The laboratory is protected by a series of locked vault doors. Each door is controlled by a computer and requires a password to open. Unfortunately, our undercover agents have not been able to obtain the secret passwords for the vault doors, but one of our junior agents obtained the source code for each vault's computer! You will need to read the source code for each level to figure out what the password is for that vault door. As a warmup, we have created a replica vault in our training facility. The source code for the training vault is here: [VaultDoorTraining.java](VaultDoorTraining.java)
## Hints
> The password is revealed in the program's source code.
## Solution
This problem can be solved without any coding. We see that the main function of this Java class takes in an input and- after putting it into the picoCTF flag format- passes it in through the `checkPassword` function where it simply returns true if the password is equal to the flag and false otherwise. Our flag is simply the string that this function compares the input with.
## Flag
`picoCTF{w4rm1ng_Up_w1tH_jAv4_fcb79c48f5b}`