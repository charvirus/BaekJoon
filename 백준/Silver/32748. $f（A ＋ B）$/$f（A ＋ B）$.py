import sys

input = sys.stdin.readline

ls = list(input().split())
a, b = input().split()

aa =""
bb =""
for i in a:
    aa += str(ls.index(i))
for i in b:
    bb += str(ls.index(i))
s = str(int(aa) + int(bb))
res = ""
for i in s:
    res += ls[int(i)]

print(res)