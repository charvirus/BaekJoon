import sys
input = sys.stdin.readline

n = int(input())
mp = set()
cnt = 0
for i in range(n):
    a,b = map(int,input().split())
    if b == 1:
        if a in mp:
            cnt += 1
        mp.add(a)
    else:
        if a not in mp:
            cnt += 1
        else:
            mp.remove(a)
print(cnt+len(mp))