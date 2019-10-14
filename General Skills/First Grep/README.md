# First Grep
Points: 100
## Category
General Skills
## Problem Statement
> Can you find the flag in [file](file)? This would be really tedious to look through manually, something tells me there is a better way. You can also find the file in /problems/first-grep_2_04dbf496b78e6c37c0097cdfef734d88 on the shell server.
## Hints
> grep [tutorial](https://ryanstutorials.net/linuxtutorial/grep.php)
## Solution
When we simply `cat` this file in the shell to find the flag, we are met with a lot of random noise. Here,we can use a `grep` command. What `grep` does is it filters for a specific expression in a plain-text. We know that picoCTF flags are all in the format of picoCTF{...}, so we can grep for the expression `picoCTF`. Specifically, we would do `cat file | grep picoCTF`. 
## Flag
`picoCTF{grep_is_good_to_find_things_bf6aec61}`