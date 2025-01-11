import sys

input = sys.stdin.readline

arr = [0, 1, 2]
for i in range(3, 1001):
    arr.append(arr[i - 2] + arr[i - 1])
while 1:
    a, b = map(int, input().split())
    if a == 0 and b == 0:
        break
    else:
        cnt = 0
        for i in range(1, 1001):
            if a <= arr[i] <= b:
                cnt += 1
        print(cnt)
