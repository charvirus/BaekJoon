import sys

N = int(sys.stdin.readline())
nameList = [sys.stdin.readline().strip() for i in range(N)]

nameList = list(set(nameList))

nameList.sort()
nameList.sort(key=len)

for i in nameList:
    print(i)