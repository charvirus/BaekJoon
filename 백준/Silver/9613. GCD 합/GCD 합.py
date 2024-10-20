import sys
import math

input = sys.stdin.readline

n = int(input())

for i in range(n):
    s = 0
    arr = list(map(int, input().split()))
    for j in range(1, len(arr)):
        for k in range(j + 1,len(arr)):
            s += math.gcd(arr[j], arr[k])
    print(s)
