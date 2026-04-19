n, m = map(int, input().split())
ans = ''
if n == 0:
    ans = '0'
else:
    while n:
        t = n % m
        if t >= 10:
            t = chr(64+(t-9))
        ans += str(t)
        n = n // m
print(ans[::-1])
