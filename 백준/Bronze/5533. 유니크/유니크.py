import sys

input = sys.stdin.readline

n = int(input())
cnt = [[],[],[]]
for i in range(n):
    inp = list(map(int,input().split()))
    for j in range(3):
        cnt[j].append(inp[j])
for i in range(n):
    sum = 0
    for j in range(3):
        if cnt[j].count(cnt[j][i]) == 1:
            sum += cnt[j][i]
    print(sum)