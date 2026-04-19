import sys

input = sys.stdin.readline

n, m = map(int, input().split())
password = input()
for _ in range(m):
    memo = input()
    idx = 0
    for i in memo:
        if i == password[idx]:
            idx += 1
        if idx == n:
            break
    if idx == n:
        print("true")
    else:
        print("false")
