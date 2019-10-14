# extensions
Points: 150
## Category
Forensics
## Problem Statement
> This is a really weird text file [TXT](flag.txt)? Can you find the flag?
## Hints
> How do operating systems know what kind of file it is? (It's not just the ending!
> Make sure to submit the flag as picoCTF{XXXXX}
## Solution
We are given a text file of bytes. This hints to us that it is not just a plain-text .txt file. When we actually open the file we immediatly see the words `PNG`. If we change the filename extension to .png, it renders an image that shows us the flag.
## Flag
`picoCTF{now_you_know_about_extensions}`