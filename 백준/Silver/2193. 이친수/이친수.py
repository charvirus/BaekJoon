n = int(input())
chk = [0] * (n+1)
chk[0] = 0
chk[1] = 1
for i in range(2,n+1):
    chk[i] = chk[i-2] + chk[i-1]
print(chk[n])
