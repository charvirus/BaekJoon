import math
import sys

input = sys.stdin.readline
N, K = map(int, input().split())
div = 1
for i in range(2, N + 1):
    div *= 10 ** (int(math.log10(i)) + 1)
    div += i
    div %= K
print(div % K)
