import sys

input = sys.stdin.readline
tag = {}
for i in range(int(input())):
    inp = list(input().split())
    for i in range(2,len(inp)):
        if inp[i] in tag:
            tag[inp[i]] += 1
        else:
            tag[inp[i]] = 1
ans = max(tag.values())
cnt = 0
flag = False
for i in tag:
    if tag[i] == ans:
       cnt += 1
    if cnt >= 2:
        flag = True
        break

print(-1 if flag else max(tag, key=tag.get))
