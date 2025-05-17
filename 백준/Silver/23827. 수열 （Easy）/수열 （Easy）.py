input()
l = list(map(int,input().split()))
sl = sum(l)
res = 0
for i in l:
    sl -= i
    res = (res + i * sl) % 1000000007
print(res)