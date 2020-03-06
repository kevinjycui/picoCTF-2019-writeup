# asm1
Points: 200
## Category
Reverse Engineering
## Problem Statement
> What does asm1(0x53e) return? Submit the flag as a hexadecimal value (starting with '0x'). NOTE: Your submission for this question will NOT be in the normal flag format. [Source](text.S) located in the directory at /problems/asm1_4_431c7088e03c0028398793773ccf89d7.
## Hints
> assembly [conditions](https://www.tutorialspoint.com/assembly_programming/assembly_conditions.htm)
## Solution
To understand assembly, we have to read it line by line. Note that all values in assembly are hexadecimal. 
```asm
	<+0>:	push   ebp
	<+1>:	mov    ebp,esp
```
We know that we are putting 0x53e into the stack, which gets pushed into ebp and then moved into esp on lines 0 and 1. This just means that this value is now in the first position in the stack now at ebp+0x8. We then face our first condition. 
```asm
	<+3>:	cmp    DWORD PTR [ebp+0x8],0x35d
	<+10>:	jg     0x512 <asm1+37>
```
We see that we are comparing the first value in the stack (which is 0x53e) to 0x35d. The next line tells us what they are being compared for. The `jg` means "jump if greater". Since 0x53e is indeed greater than 0x35d, we jump to the line given by this condition: line 37. 
```asm
	<+37>:	cmp    DWORD PTR [ebp+0x8],0x53e
	<+44>:	jne    0x523 <asm1+54>
```
Here we have another comparison, this time between the first value in the stack and 0x53e. The condition `jne` means "jump if not equal". Since 0x53e is obviously *not* not equal to 0x53e, this is false and we do not jump. We then go ont to the next line.
```asm
	<+46>:	mov    eax,DWORD PTR [ebp+0x8]
	<+49>:	sub    eax,0xb
	<+52>:	jmp    0x529 <asm1+60>
```
These three lines are simple. The value in the stack is moved to the variable that will be returned eax. We subtract 0xb from it, so now eax is equal to 0x533. We then unconditionally  `jmp` to line 90.
```asm
	<+60>:	pop    ebp
	<+61>:	ret    
```
At line 60, the stack is popped and eax is returned. Since eax is equal to 0x533, that is our flag.
## Flag
`0x533`
