import sys

input = sys.stdin.readline

s = input().strip()
n = len(s)
ans = 0
arr = [int(i) for i in s]

presum = [0] * (n + 1)
for i in range(1, n + 1):
    presum[i] = presum[i - 1] + arr[i - 1]

for l in range(2, n + 1, 2):
    for s in range(n - l + 1):
        mid = s + l // 2

        sumf = presum[mid] - presum[s]
        sumb = presum[s + l] - presum[mid]
        if sumf == sumb:
            ans = max(ans, l)
print(ans)
