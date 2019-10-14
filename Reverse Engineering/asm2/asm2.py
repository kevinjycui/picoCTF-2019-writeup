e4 = int('0x1e', 16)
e8 = int('0x9', 16)
while e8 <= int('0x47a6', 16):
    e4 += int('0x1', 16)
    e8 += int('0xa9', 16)
print(hex(e4))
