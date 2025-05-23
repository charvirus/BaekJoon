import sys

input = sys.stdin.readline

t = int(input())
l = list(input().split())
ans = 0
mp = {}
for i in range(t):
    if l[i] in mp:
        mp[l[i]] += 1
    else:
        mp[l[i]] = 1
    if mp[l[i]] >= 5:
        print(i + 1)
        exit(0)
print(ans)
