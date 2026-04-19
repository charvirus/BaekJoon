import sys

input = sys.stdin.readline

n = int(input())
stoplist = list(map(int,input().split()))
stoplist.sort()

stopmin = sys.maxsize
cnt = 0
for i in range(n - 1):
    stopmin = min(stoplist[i + 1] - stoplist[i], stopmin)
    
for i in range(n - 1):
    if stoplist[i + 1] - stoplist[i] == stopmin:
        cnt += 1

print(stopmin, cnt)