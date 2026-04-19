n = int(input())
p = list(map(int, input().split()))

f = True
s = False
for i in range(n - 1):
    if p[i] < p[i + 1]:
        if s:
            f = False
            break
    elif p[i] == p[i + 1]:
        f = False
        break
    else:
        s = True
print("YES" if f else "NO")
