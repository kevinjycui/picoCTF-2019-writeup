# asm2
Points: 250
## Category
Reverse Engineering
## Problem Statement
> What does asm2(0x9,0x1e) return? Submit the flag as a hexadecimal value (starting with '0x'). NOTE: Your submission for this question will NOT be in the normal flag format. [Source](test.S) located in the directory at /problems/asm2_2_5667a5cd5764b4356121f1d6232ac78c.
## Hints
> assembly [conditions](https://www.tutorialspoint.com/assembly_programming/assembly_conditions.htm)
## Solution
Unlike asm1, there are now two parameters being given which means two positions on the stack are filled. 
```asm
	<+0>:	push   ebp
	<+1>:	mov    ebp,esp
	<+3>:	sub    esp,0x10
	<+6>:	mov    eax,DWORD PTR [ebp+0xc]
	<+9>:	mov    DWORD PTR [ebp-0x4],eax
	<+12>:	mov    eax,DWORD PTR [ebp+0x8]
	<+15>:	mov    DWORD PTR [ebp-0x8],eax
```
We see that 0x10 is being subtracted from esp. Once again we can ignore most of the initialization from line 0 to 3. When we keep track of which variable is where, we see that two new positions at ebp-0x4 and ebp-0x8 are created and store the values from ebp+0xc and ebp+0x8 using temporary variable esp.
```asm
	<+18>:	jmp    0x50c <asm2+31>
```
At this point, we know that ebp-0x4 is storing 0x1e and ebp-0x8 is storing 0x9. We then take an unconditional jump `jmp` to line 31.
```asm
	<+31>:	cmp    DWORD PTR [ebp-0x8],0x47a6
	<+38>:	jle    0x501 <asm2+20>
```
We see here that we are comparing the value stored at ebp-0x8, which is 0x9, to 0x47a6. Since the comparison is less or equal to and the condition is `jle`, we male the jump back up to line 20.
```asm
    <+20>:	add    DWORD PTR [ebp-0x4],0x1
	<+24>:	add    DWORD PTR [ebp-0x8],0xa9
	<+31>:	cmp    DWORD PTR [ebp-0x8],0x47a6
	<+38>:	jle    0x501 <asm2+20>
    <+40>:	mov    eax,DWORD PTR [ebp-0x4]
	<+43>:	leave  
	<+44>:	ret    
```
At this point we can start to see a for loop type of logic occuring. After jumping to line 20, the value stored at ebp-0x4 increases by 0x1 and the value at ebp-0x8 increases by 0xa9. This continues to loop because of the jle condition until ebp-0x8 is not less or equal to 0x47a6. Finally, once the loop ends, we move the value stored at ebp-0x4 to the returned value eax. We can simply simulate this with a [Python script](asm2.py).
## Flag
`0x8b`