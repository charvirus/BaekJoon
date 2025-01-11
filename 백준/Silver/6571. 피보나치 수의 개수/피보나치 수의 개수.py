import sys
input = sys.stdin.readline

arr = [1, 2]
for i in range(2, 501):
    arr.append(arr[i - 2] + arr[i - 1])
while 1:
    a, b = map(int, input().split())
    if a == 0 and b == 0:
        break
    else:
        cnt = 0
        for x in arr:
            if a <= x <= b:
                cnt += 1
            elif b < x:
                break
        print(cnt)