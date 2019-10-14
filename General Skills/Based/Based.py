while True:
    n = input()
    s = n.split(' ')
    if len(s) == 1:
        s = []
        for c in range(0, len(n), 2):
            s.append(n[c:c+2])
    for b in [2, 8, 16, 64]:
        for i in range(len(s)):
            try:
                print(chr(int(s[i], b)), end='')
            except:
                print('.', end='')
        print()