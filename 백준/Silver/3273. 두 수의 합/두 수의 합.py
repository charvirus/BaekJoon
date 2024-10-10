import sys

input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))
x = int(input())
a.sort()
cnt = 0
left, right = 0, n - 1
while left < right:
    if a[left] + a[right] < x:
        left += 1
    elif a[left] + a[right] > x:
        right -= 1
    else:
        cnt += 1
        left += 1
        right -= 1
print(cnt)