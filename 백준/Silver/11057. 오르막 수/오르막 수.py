n = int(input())
a = [1] * 10

for i in range(n-1):
    for j in range(1,10):
        a[j] += a[j-1]

print(sum(a) % 10007)
