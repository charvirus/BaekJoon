import sys

input = sys.stdin.readline
k = 1
N = int(input())
inpl = []
for i in range(N):
    inpl.append(input().strip())

while True:
    if len(set([i[-1 * k:] for i in inpl])) == N:
        print(k)
        break
    else:
        k += 1
