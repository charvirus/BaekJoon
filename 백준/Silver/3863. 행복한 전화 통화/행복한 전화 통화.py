import sys

input = sys.stdin.readline


res = []
while True:
    n, m = map(int, input().split())
    if n == 0 and m == 0:
        break

    call = [[*map(int,input().split()[2:])] for _ in range(n)]
    tap = [[*map(int,input().split())] for _ in range(m)]

    for i in range(m):
        cnt = 0
        for j in range(n):
            if tap[i][0]<=call[j][0]<tap[i][0]+tap[i][1] or call[j][0]<=tap[i][0] <call[j][0]+call[j][1]:
                cnt += 1
        res.append(cnt)
print(*res, sep="\n")
