from math import floor

N = int(input())

a = list(map(int, input().split()))
b = list(map(int, input().split()))
k = list(map(float, input().split()))
new_ad = [0] * N
for i in range(N):
    new_ad[i] = k[i] * 10

res = 0

for i in range(N):
    if k[i] >= 1:
        res += floor(a[i] * new_ad[i] / 10)
        res -= b[i]
    else:
        res += a[i]
        res -= floor(b[i] * new_ad[i] / 10)

print(res)