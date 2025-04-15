import sys

input = sys.stdin.readline

for i in range(int(input())):
    wear = {}
    n = int(input())
    for j in range(n):
        name, type = input().split()
        if type in wear.keys():
            wear[type].append(name)
        else:
            wear[type] = [name]
    cnt = 1

    for i in wear:
        cnt *= (len(wear[i]) + 1)
    print(cnt - 1)
