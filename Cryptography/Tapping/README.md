# Tapping
Points: 200
## Category
Cryptography
## Problem Statement
> Theres tapping coming in from the wires. What's it saying `nc 2019shell1.picoctf.com 49914`.
## Hints
> What kind of encoding uses dashes and dots?
> The flag is in the format PICOCTF{}
## Solution
After connecting to this port, we are given a sequence of dots and dashes as so:
```
.--. .. -.-. --- -.-. - ..-. { -- ----- .-. ... ...-- -.-. ----- -.. ...-- .---- ... ..-. ..- -. ----. ----- ...-- .---- ....- ----- ....- ....- ---.. } 
```
This allows us to deduce that the method of encryption is one of the most well-known types of cryptography: morse code. If you are proficient with morse, feel free to crack it yourself. Otherwise, an online tool such as [unit-conversion.info](http://www.unit-conversion.info/texttools/morse-code/) will do.
## Flag
`PICOCTF{M0RS3C0D31SFUN903140448}`