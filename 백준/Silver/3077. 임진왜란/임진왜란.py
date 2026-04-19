import sys

input = sys.stdin.readline
cnt = 0

N = int(input())
mainInp = dict(zip(input().split(), [i for i in range(N)]))
checkInp = list(input().split())

for i in range(0, N - 1):
    for j in range(i + 1, N):
        if mainInp.get(checkInp[i]) < mainInp.get(checkInp[j]):
            cnt += 1

print('{0}/{1}'.format(cnt, int(N * (N - 1) / 2)))
