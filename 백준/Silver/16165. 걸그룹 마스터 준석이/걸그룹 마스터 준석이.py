import sys
input = sys.stdin.readline
from collections import defaultdict

n, m = map(int,input().split())
girlgroup = defaultdict(list)

for i in range(n):
    name = input().strip()
    x = int(input())
    for j in range(x):
        girlgroup[name].append(input().strip())

girlgroup = dict(girlgroup)

for i in range(m):
    name = input().strip()
    if int(input()):
        for key, values in girlgroup.items():
            if name in values:
                print(key)
                break
    else:
        print(*sorted(girlgroup[name]),sep="\n")