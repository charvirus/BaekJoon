import sys

input = sys.stdin.readline
N, M = map(int, input().split())
seq = list(map(int, input().split()))
cnt = 0
for i in range(1, N):
    if M > abs(seq[i] - seq[i - 1]):
        seq[i] += int(1e13)
        cnt += 1
print(cnt)
