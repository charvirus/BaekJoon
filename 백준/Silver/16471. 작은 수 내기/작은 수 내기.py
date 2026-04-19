import sys

input = sys.stdin.readline

n = int(input())
ju = sorted(map(int, input().split()), reverse=True)
ma = sorted(map(int, input().split()), reverse=True)
midx = 0
cnt = 0
for i in ju:
    if i < ma[midx]:
        cnt += 1
        midx += 1
print("YES" if cnt > n // 2 else "NO")
