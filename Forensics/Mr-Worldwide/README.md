# Mr-Worldwide
Points: 200
## Category
Cryptography
## Problem Statement
> A musician left us a [message](message.txt). What's it mean?
## Solution
This one is perhaps one of the more bizarre challenges, yet still amusing. We are given a text file full of what seems to be coordinates. When we just put these coordinates into Google Maps in the form of (longitude, latitude), we get major cities for each coordinate. These cities are, in the order that they were in the text file:
```
Kyoto, Japan				
Odessa, Ukraine				
Dayton, United States			
Istanbul, Turkey			
Abu Dhabi, United Arab Emirates		
Kuala Lumpur, Malaysia			
_					
Addis Ababa, Ethiophia			
Loja, Ecuador				
Amsterdam, Netherlands			
Sleepy Hollow, United States		
Kodiak, United States			
Alexandria, Egypt		
```
When we take the first character from each of these cities, we get another city: KODIAK_ALASKA, which is our flag.
## Flag
`picoCTF{KODIAK_ALASKA}`