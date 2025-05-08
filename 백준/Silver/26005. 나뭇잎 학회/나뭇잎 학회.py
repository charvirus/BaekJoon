import sys

input = sys.stdin.readline

n = int(input())
res = n * n / 2
if n == 1:
    res = 0
elif n % 2 == 1 :
    res += 1
print(int(res))
