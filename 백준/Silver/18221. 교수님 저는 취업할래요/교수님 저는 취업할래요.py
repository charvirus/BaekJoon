import sys

input = sys.stdin.readline

n = int(input().strip())

arr = []
cnt = 0
pf = None
sk = None
ot = []

for i in range(n):
    nums = list(map(int, input().split()))
    arr.append(nums)
    if 5 in nums:
        pf = (nums.index(5), i)
    if 2 in nums:
        sk = (nums.index(2), i)

x1, x2 = min(pf[0], sk[0]), max(pf[0], sk[0])
y1, y2 = min(pf[1], sk[1]), max(pf[1], sk[1])

dis = (x1 - x2) ** 2 + (y1- y2) ** 2

for y in range(y1,y2+1):
    cnt += arr[y][x1:x2+1].count(1)

if cnt >= 3 and dis >= 25:
    print(1)
else:
    print(0)