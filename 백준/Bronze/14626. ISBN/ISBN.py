n = list(input())
chk = 0
star_mul = 0
m = int(n[-1])
ans = 0
for i in range(12):
    if i % 2 == 0:
        multiple = 1
    else:
        multiple = 3
    if n[i].isnumeric():
        chk += int(n[i]) * multiple
    else:
        star_mul = multiple
for i in range(10):
    if (m + chk + i * star_mul) % 10 == 0:
        ans = i
print(ans)
