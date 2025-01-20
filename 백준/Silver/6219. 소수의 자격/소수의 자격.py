import sys
input = sys.stdin.readline

arr = [False , False] +[True]*4000000
for i in range(2, 4000000):
    if arr[i]:
        for j in range(i+i,4000000, i ):
            arr[j] = False

a,b,d = map(int,input().split())
cnt =0
for i in range(a,b):
    if arr[i]:
        if str(d) in str(i):
            cnt += 1
print(cnt)