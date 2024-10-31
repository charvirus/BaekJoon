import sys

input = sys.stdin.readline
N = int(input())
K = 64

while True:
    if N % 2 == 1:
        break
    N //= 2
    K -= 1
print(K)