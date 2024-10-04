import sys

input = sys.stdin.readline
N = int(input())
leng = len(str(N))
result = 0
for i in range(leng):
    digit = N % 10
    N = N // 10

    if digit > 4:
        result += (digit - 1) * (9 ** i)
    else:
        result += digit * (9 ** i)
print(result)
