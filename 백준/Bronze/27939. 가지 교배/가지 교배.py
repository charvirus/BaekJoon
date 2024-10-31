import sys

input = sys.stdin.readline
N = int(input())
PW = list(input().split())
m, k = map(int, input().split())

arr = []
for i in range(m):
    arr.append(list(map(int, input().split())))
for i in arr:
    for j in i:
        if PW[j-1] == "P":
            break
    else:
        print("W")
        break
else:
    print("P")
