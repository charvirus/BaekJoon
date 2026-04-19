import sys
input = sys.stdin.readline

arr = [ float(input()) for i in range(10)]
arr.sort()
ans = 1
for i in range(1,10):
    ans *= arr[i]
print(round(ans/0.00036288,7))