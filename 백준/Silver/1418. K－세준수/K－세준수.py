n = int(input())
m = int(input())

l = [0 for i in range(n+1)]
for i in range(2,n+1):
    if not l[i]:
        for j in range(i,n+1,i):
            if j % i == 0:
                l[j] = max(l[j],i)
p = 0
for i in l:
    if i <= m:
        p += 1
print(p-1)