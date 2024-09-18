import sys

input = sys.stdin.readline

M, N = map(int, input().split())
unilist = [list(map(int, input().split())) for _ in range(M)]
cnt = 0

for i in range(M):
    sortArray = sorted(unilist[i])
    temp = []
    for j in unilist[i]:
        temp.append(sortArray.index(j) + 1)
    unilist[i] = temp

for i in range(M - 1):
    for j in range(i + 1, M):
        if unilist[i] == unilist[j]:
            cnt += 1
print(cnt)
