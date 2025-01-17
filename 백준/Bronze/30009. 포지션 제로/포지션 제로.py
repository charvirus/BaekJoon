import sys

input = sys.stdin.readline

n = int(input())
x, y, r = map(int, input().split())

a, b = 0, 0
for i in range(n):
    inp = int(input())
    if x-r == inp or x+r == inp:
        b +=1
    elif x-r < inp < x+r:
        a+=1
print(a,b)