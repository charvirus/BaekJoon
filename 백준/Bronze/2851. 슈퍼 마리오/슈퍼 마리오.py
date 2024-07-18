import sys

arr = [int(input())]
min = sys.maxsize
ans = 0
before = arr[0]
for i in range(9):
    arr.append(int(input()) + arr[i])

for i in range(10):
    beforeAbso = abs(100-before)
    abso = abs(100 - arr[i])
    if min > abso:
        min = abso
        ans = arr[i]
    if beforeAbso == abso:
        if beforeAbso>abso:
            ans = before
        else :
            ans = arr[i]
    before = arr[i]
print(ans)
