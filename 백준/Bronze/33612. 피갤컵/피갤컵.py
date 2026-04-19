n = int(input())
y, m = 2024, 8 + 7 * (n - 1)

while m > 12:
    y += 1
    m -= 12
print(y, m)