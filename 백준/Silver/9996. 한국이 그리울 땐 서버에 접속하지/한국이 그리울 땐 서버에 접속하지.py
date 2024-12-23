import sys
input = sys.stdin.readline

n = int(input())
pt = list(input().strip().split("*"))

for i in range(n):
    inp = input().strip()
    if pt[0] in inp and pt[1] in inp:
        if len(inp) >= len(pt[0]+pt[1]) and (inp[:len(pt[0])] == pt[0] and inp[-len(pt[1]):] == pt[1]):
            print('DA')
            continue
    print('NE')