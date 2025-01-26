n = int(input())
print(n, end=" ")
for i in range(1, n // 2):
    print(i,n - i, end=" ")
if n != 1:
    print(n // 2, end=" ")
    if n % 2 == 1:
        print(n // 2 + 1)
