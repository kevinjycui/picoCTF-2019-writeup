# m00nwalk2
Points: 300
## Category
Forensics
## Problem Statement
> Revisit the last transmission. We think this [transmission](message.wav) contains a hidden message. There are also some clues [clue 1](clue1.wav), [clue 2](clue2.wav), [clue 3](clue3.wav). You can also find the files in /problems/m00nwalk2_1_ee6747feaad7bc16aa5ca2743ecd9652.
## Hints
> Use the clues to extract the another flag from the .wav file
## Solution
Similarily to m00nwalk, we use QSSTV or another SSTV decoding software to extract the 4 images out of these 4 wav files. We end up with this [message](message.png), and these three clues:
* [clue 1](clue1.png)
* [clue 2](clue2.png)
* [clue 3](clue3.png)
Now for the second part of the challenge: figuring out the flag. We require some cryptography. The clues direct us to [Alan Eliasen's Future Boy website](https://www.futureboy.us) with a password hidden_stegosaurus. We go to this site and open the stegonographic decoder, with the password key being the one given to us. After uploading our message.wav file, the hidden flag is revealed.
## Flag
`picoCTF{the_answer_lies_hidden_in_plain_sight}`