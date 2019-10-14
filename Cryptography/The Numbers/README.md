# The Numbers
Points: 50
## Category
Cryptography
## Problem Statement
> The [numbers](the_numbers.png)... what do they mean?
## Hints
> The flag is in the format PICOCTF{}
## Solution
When we manually open this file and simply look at the image, we can see that there are a sequence of numbers. We can quickly realise that these numbers are never below 1 and never exceed 26. When we manually find the characters at each index in the alphabet in uppercase, we get our flag. We could also use a basic script such as [this](the_numbers.py) to get the flag.
## Flag
`PICOCTF{THENUMBERSMASON}`