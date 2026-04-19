input()
arr = list(map(int, input().split()))

e, d = 0, 0
for i in arr:
    if i % 2 == 1:
        d += 1
    else:
        e += 1
print("Happy" if e > d else "Sad")
