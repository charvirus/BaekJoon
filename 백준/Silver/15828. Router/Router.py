import sys

input = sys.stdin.readline

n = int(input())
q = []
while 1:
    inp = int(input())
    if inp == -1:
        break
    if inp != 0 and len(q) < n:
        q.append(inp)
    elif len(q) > 0 and inp == 0:
        q.pop(0)
if q :
    print(*q)
else:
    print("empty")
