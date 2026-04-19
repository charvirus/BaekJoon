import sys

input = sys.stdin.readline

n, m = map(int, input().split())
tk = False
sk = False
for i in range(n):
    a, b = map(int, input().split())
    if a != b:
        tk = True
        break
for i in range(m):
    a, b = map(int, input().split())
    if a != b:
        sk = True
        break
if tk:
    print("Wrong Answer")
elif sk:
    print("Why Wrong!!!")
else:
    print("Accepted")
