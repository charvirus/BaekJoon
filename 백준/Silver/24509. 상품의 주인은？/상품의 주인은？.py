import sys

input = sys.stdin.readline

N = int(input())
check = [False] * (N + 1)
record = [[0]]
for i in range(N):
    record.append(list(map(int, input().split())))

prize = []
n = 200001
for i in range(1, 5):
    max = -1
    for j in range(1, N + 1):
        if not check[record[j][0]]:
            if record[j][i] > max:
                max = record[j][i]
                n = record[j][0]
            elif record[j][i] == max:
                n = min(record[j][0], n)

    prize.append(n)
    check[n] = True
print(*prize)
