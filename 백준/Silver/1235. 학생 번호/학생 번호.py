import sys

input = sys.stdin.readline
k = 1
N = int(input())
l = [input().strip() for i in range(N)]
while True:
    if len(set([i[-1 * k:] for i in l])) == N:
        print(k)
        break
    k += 1