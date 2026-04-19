n = input()
c = 10
for i in range(1, len(n)):
    if n[i] == n[i-1]:
        c += 5
    else:
        c += 10
print(c)