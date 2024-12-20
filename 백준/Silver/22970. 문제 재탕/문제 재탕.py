import sys

input = sys.stdin.readline

n = int(input())
l = list(map(int, input().split()))+[0]
cnt = 0
tmp = 1
if n == 1:
    print(1)
else:
    for i in range(1, n):
        if l[i - 1] > l[i] and l[i] < l[i + 1]:
            cnt = max(tmp + 1, cnt)
            tmp = 1
            continue
        elif l[i - 1] < l[i] or l[i - 1] > l[i]:
            tmp += 1
        elif l[i - 1] == l[i]:
            tmp = 1
        cnt = max(tmp, cnt)
    print(cnt)