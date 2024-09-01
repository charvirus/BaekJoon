import sys

input = sys.stdin.readline

N = int(input())
arr = []
ans = []
for _ in range(N):
    arr.append(list(input().split()))

# arr = sorted(arr, key=lambda x: x[4])

for i in arr:
    if i[1] == "jaehak" and i[2] == "notyet" and (int(i[3]) > 3 or int(i[3]) == -1):
        ans.append([i[0], int(i[4])])
ans = sorted(ans,key=lambda x:x[1])
name = []
if len(ans) >= 10:
    print(10)
    for i in ans[0:10]:
        name.append(i[0])
else:
    print(len(ans))
    for i in ans[0:len(ans)]:
        name.append(i[0])

name = sorted(name)
for i in name:
    print(i)