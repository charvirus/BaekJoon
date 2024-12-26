n, m = map(int, input().split())
r = ''.join([str(i) for i in range(1, n+1)])
print(r.count(str(m)))
