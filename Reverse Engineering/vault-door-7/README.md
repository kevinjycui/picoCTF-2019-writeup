# vault-door-7
Points: 400
## Category
Reverse Engineering
## Problem Statement
> This vault uses bit shifts to convert a password string into an array of integers. Hurry, agent, we are running out of time to stop Dr. Evil's nefarious plans! The source code for this vault is here: [VaultDoor7.java](VaultDoor7.java)
## Hints
> Use a decimal/hexademical converter such as this one: https://www.mathsisfun.com/binary-decimal-hexadecimal-converter.html
> You will also need to consult an ASCII table such as this one: https://www.asciitable.com/
## Solution
This file has lots of confusing bitshifting and conversions, but we can look at the comment in the file to better understand what we are dealing with:
```java
    // Each character can be represented as a byte value using its
    // ASCII encoding. Each byte contains 8 bits, and an int contains
    // 32 bits, so we can "pack" 4 bytes into a single int. Here's an
    // example: if the hex string is "01ab", then those can be
    // represented as the bytes {0x30, 0x31, 0x61, 0x62}. When those
    // bytes are represented as binary, they are:
    //
    // 0x30: 00110000
    // 0x31: 00110001
    // 0x61: 01100001
    // 0x62: 01100010
    //
    // If we put those 4 binary numbers end to end, we end up with 32
    // bits that can be interpreted as an int.
    //
    // 00110000001100010110000101100010 -> 808542562
    //
    // Since 4 chars can be represented as 1 int, the 32 character password can
    // be represented as an array of 8 ints.
    //
    // - Minion #7816
```
TL;DR: it converts ASCII to bytes, bytes to hex, then takes each digit out of the 4 digits in the hex string, converts them to binary, concatenates them, and converts them to ints. This 32 characters password is thus expressed as an array of 8 ints.

To reverse this, we just take that logic and flip it around. I do this in this [Java file](vault7.java) We start off by loopign through this int array. We take the int and convert it to a binary string. We splice this string into 4 parts and convert those into hexadecimal numbers. We convert each one into ASCII and concatenate them into a hex string and then an int. Finally, we convert that to ASCII and concatenate them together into a String. This is our flag.
## Flag
`picoCTF{A_b1t_0f_b1t_sh1fTiNg_f79bcd1c15}`