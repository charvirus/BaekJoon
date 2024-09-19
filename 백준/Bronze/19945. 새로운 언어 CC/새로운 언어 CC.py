import sys

input = sys.stdin.readline

n = int(input())
ans = ""
if n < 0:
    print(32)
elif n > 0:
    print(len(bin(n))-2)
else:
    print(1)
