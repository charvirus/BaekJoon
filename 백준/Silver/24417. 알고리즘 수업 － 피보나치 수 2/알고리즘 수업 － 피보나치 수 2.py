mod = int(1e9)+7
n = int(input())
ans = n-2
x, y = 1, 1
for _ in range(n-2):
    x,y = (x+y)%mod, x
print(x, ans)