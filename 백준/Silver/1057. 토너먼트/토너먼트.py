import sys

input = sys.stdin.readline
p = 0
N, K, L = map(int, input().split())
while K != L:
    K -= K // 2
    L -= L // 2
    p += 1
print(p)
