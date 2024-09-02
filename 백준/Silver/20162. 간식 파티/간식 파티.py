import sys

input = sys.stdin.readline
N = int(input())
inp = int(input())
dp1 = [inp]
dp2 = [inp]

for _ in range(N - 1):
    inp = int(input())
    temp = []
    for i,v in enumerate(dp1):
        if v<inp:
            temp.append(dp2[i])
    dp1.append(inp)
    if temp:
        dp2.append(max(temp)+inp)
    else:
        dp2.append(inp)

print(max(dp2))