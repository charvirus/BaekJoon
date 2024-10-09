import sys

input = sys.stdin.readline

n = int(input())
if n % 2 == 1:
    print("1 2 "*int(n / 2)+"3")
else:
    print("1 2 "*int(n / 2))