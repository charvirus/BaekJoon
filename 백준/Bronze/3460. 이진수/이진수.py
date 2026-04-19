T = int(input())
for _ in range(T):
    arr = []
    n = int(input())
    i = 0
    while n > 0:
        if n % 2 == 1:
            arr.append(i)
        i += 1
        n = n // 2
    print(*arr)