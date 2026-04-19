import sys

input = sys.stdin.readline

N, M, K = map(int, input().split())
if N + M - 1 <= K:
    print("YES")
    for i in range(N):
        for j in range(M):
            print(i + j + 1, end=" ")
        print()
else:
    print("NO")
