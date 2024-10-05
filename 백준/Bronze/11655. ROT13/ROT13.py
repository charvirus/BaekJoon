import sys

input = sys.stdin.readline

inp = input()
inp = list(inp)
for i in inp:
    asc = 0
    if i.isalpha():
        asc = ord(i) + 13
        if (ord(i) <= 90 < asc) or (ord(i) >= 97 and asc > 122):
            print(chr(asc - 26), end='')
        else:
            print(chr(asc), end='')
    else:
        print(i, end="")