import sys

input = sys.stdin.readline

n = int(input())
dif = n//2
for i in range(1, dif+1):
    print(f'{dif+i} {i}',end=" ")
if n % 2 == 1:
    print(n)