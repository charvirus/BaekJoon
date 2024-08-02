N = int(input())
nameList = [input() for i in range(N)]

nameList = list(set(nameList))

nameList.sort()
nameList.sort(key=len)

for i in nameList:
    print(i)