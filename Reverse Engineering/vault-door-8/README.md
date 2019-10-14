# vault-door-8
Points: 450
## Category
Reverse Engineering
## Problem Statement
> Apparently Dr. Evil's minions knew that our agency was making copies of their source code, because they intentionally sabotaged this source code in order to make it harder for our agents to analyze and crack into! The result is a quite mess, but I trust that my best special agent will find a way to solve it. The source code for this vault is here: [VaultDoor8.java](VaultDoor8.java)
## Hints
> Clean up the source code so that you can read it and understand what is going on.
> Draw a diagram to illustrate which bits are being switched in the scramble() method, then figure out a sequence of bit switches to undo it. You should be able to reuse the switchBits() method as is.
## Solution
When we open this file, we are greeted with something very different from the other vault-door problems, in that the code has been minified. Simply put it through an online Java beautifier such as [Code Beautify](https://codebeautify.org/javaviewer) and look at the code. The most important part is the bit shifting in the `scramble` function: 
```
public char[] scramble(String password) {
  /* Scramble a password by transposing pairs of bits. */
  char[] a = password.toCharArray();
  for (int b = 0; b < a.length; b++) {
   char c = a[b];
   c = switchBits(c, 1, 2);
   c = switchBits(c, 0, 3); /* c = switchBits(c,14,3); c = switchBits(c, 2, 0); */
   c = switchBits(c, 5, 6);
   c = switchBits(c, 4, 7);
   c = switchBits(c, 0, 1); /* d = switchBits(d, 4, 5); e = switchBits(e, 5, 6); */
   c = switchBits(c, 3, 4);
   c = switchBits(c, 2, 5);
   c = switchBits(c, 6, 7);
   a[b] = c;
  }
  return a;
 }
```
Here we see a number of bit shifts. Lets start off by representing each character as what they are: 8 bits. Before the character is put through the scramble function, its indices are like this:

| Index         |
| ------------- |
| 0             |
| 1             |
| 2             |
| 3             |
| 4             |
| 5             |
| 6             |
| 7             |

Pretty obvious. Lets now go through the bit switches. The first instance of the `switchBits` function switches bit 1 and 2. The character now look like this:

| Index         | Original Index|
| ------------- | ------------- |
| 0             | 0             |
| 1             | 2             |
| 2             | 1             |
| 3             | 3             |
| 4             | 4             |
| 5             | 5             |
| 6             | 6             |
| 7             | 7             |

We then switch bits 0 with 3, 5 with 6, and 4 with 7. Now every single bit has been switched once. The character now looks like this:

| Index         | Original Index|
| ------------- | ------------- |
| 0             | 3             |
| 1             | 2             |
| 2             | 1             |
| 3             | 0             |
| 4             | 7             |
| 5             | 6             |
| 6             | 5             |
| 7             | 4             |

Once every bit has been switched once, we have to remember to switch the bits according to their current index and not their original index. So, when we continue to switch bits, we have to switch them based on their index. We continue and switch 0 with 1, 3 with 4, 2 with 5, and 6 with 7. The character now looks like this:

| Index         | Original Index|
| ------------- | ------------- |
| 0             | 2             |
| 1             | 3             |
| 2             | 7             |
| 3             | 0             |
| 4             | 6             |
| 5             | 1             |
| 6             | 4             |
| 7             | 5             |

Now all we have to do is reverse this as I do in this [Java file](vault8.java). We switch each index in the char with its original index as according to the above table to get the original character, switching 0 with 2, 1 with 3, 2 with 7, etc. and putting it into a char array which we then convert to a String and get our flag.
## Flag
`picoCTF{s0m3_m0r3_b1t_sh1fTiNg_1169cac67}`