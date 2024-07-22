x, y = map(int, input().split())
location = 1

a = 0 if y == 0 else 1
i = 1
for i in range(x + y + a - 1):
    location += i * 6

print(location + y)
