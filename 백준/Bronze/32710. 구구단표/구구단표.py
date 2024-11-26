import sys

n = int(input())

for i in range(9, 0, -1):
    if n % i == 0:
        if 1 <= n // i <= 9:
            print(1)
        else:
            print(0)
        sys.exit(0)