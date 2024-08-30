import sys

input = sys.stdin.readline
chk = [False]*100001
N = int(input())
menu = list(map(int, input().split()))
ans = 0
cnt = 0
for i in menu:
    if not chk[i]:
        cnt += 1
        chk[i] = True
    else :
        cnt -= 1
        chk[i] = False
    ans = max(cnt,ans)

print(ans)