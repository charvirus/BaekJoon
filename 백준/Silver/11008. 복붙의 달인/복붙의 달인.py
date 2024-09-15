import sys

input = sys.stdin.readline

i = int(input())
for _ in range(i):
    inp, copy = input().split()
    cnt = inp.count(copy)
    inp = inp.replace(copy,"")
    print(cnt+len(inp))
