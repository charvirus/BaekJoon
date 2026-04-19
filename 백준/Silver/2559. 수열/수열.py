import sys
input = sys.stdin.readline
N, K = map(int, input().split())
a = list(map(int, input().split()))
r = [sum(a[:K])]
for i in range(N - K):
    r.append(r[i] - a[i] + a[K + i])
print(max(r))