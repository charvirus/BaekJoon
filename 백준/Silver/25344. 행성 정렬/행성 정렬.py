import sys


def GCD(a, b):
    while b > 0:
        a, b = b, a % b
    return a


def LCM(a, b):
    return a * b // GCD(a, b)


N = sys.stdin.readline().strip()
planet = num_list = list(map(int, sys.stdin.readline().split()))

res = 1
for i in planet:
    res = LCM(i, res)

print(res)
