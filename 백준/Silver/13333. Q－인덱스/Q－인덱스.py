import sys

input = sys.stdin.readline

n = int(input())
l = sorted(list(map(int,input().split())))

for k in range(n,-1,-1):
    if k <= l[-k]:
        print(k)
        break