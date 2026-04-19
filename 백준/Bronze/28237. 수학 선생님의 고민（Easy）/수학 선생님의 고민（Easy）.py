n = int(input())
for a in range(1, n + 1):
    for b in range(1, n + 3):
        c = n // a
        d = (n + 2) // b
        if a * c == n and b * d == n + 2:
            if a * d - b * c == n + 1:
                print(a, -b, c, d); exit()
            elif -a * d + b * c == n + 1:
                print(a, b, c, -d); exit()
print(-1)
