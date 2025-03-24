import sys

sys.setrecursionlimit(10 ** 6)


def func(a, b, n):
    if n == 1:
        print(f"{a} {b}")
        return
    func(a, 6 - a - b, n - 1)
    print(f"{a} {b}")
    func(6 - a - b, b, n - 1)


a = int(input())

print(pow(2, a) - 1)
func(1, 3, a)
