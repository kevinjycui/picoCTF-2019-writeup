# 1_wanna_b3_a_r0ck5tar
Points: 350
## Category
General Skills
## Problem Statement
> I wrote you another [song](lyrics.txt). Put the flag in the picoCTF{} flag format
## Solution
Leaving off from mus1c, we once again get a file of Rockstar language. However, this time, when we [compile it](https://codewithrockstar.com/online), the compiler prompts us to give an input. We must then decode the logic of the language to know what to input. Going through [the documentation](https://codewithrockstar.com/docs) is a lot of help. Let's go through the code:
```
Rocknroll is right              
Silence is wrong                
A guitar is a six-string        
Tommy's been down               
Music is a billboard-burning razzmatazz!
Listen to the music             
If the music is a guitar                  
Say "Keep on rocking!" 
```
Here we see the initialization of some variables. The word `is` is used for assignment. We understand that in Rockstar, integers are represented by words. The lengths of each word is a digit. So `a six-string` is `136`, as 'a' has 1 character, 'six' has 3 characters, and so on. Words with 10 characters count as 0s. `Listen` means input, and `if` is just if. So, effectively, this segment of code in C++ would be:
```
boolean rocknroll = true;
boolean silence = false;
int a_guitar = 136;
int tommy = 4;
int music = 1970;
int the_music;
cin >> the_music;
if (the_music == a_guitar) {
    cout << "Keep on rocking!";
}
```
We move on to the next segment:
```
Listen to the rhythm
If the rhythm without Music is nothing
```
Here we get another input. `without` is subtract and `nothing` is zero. So effectively, this segment in C++ would be:
```
int rhythm;
cin >> rhythm;
if (rhythm - music == 0) {
    ...
}
```
Since we initialized music to 1970 earlier, that is our input. After inputting that, we get our output. Convert it into ASCII and we get our flag.
## Flag
`picoCTF{BONJOVI}`