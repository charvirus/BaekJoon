import sys

input = sys.stdin.readline

n = int(input())
l = list(map(int,input().split()))
atk = l[0]
l = sorted(l[1:])
flag = True
for i in l:
    if atk > i:
        atk += i
    else:
        flag = False
        break
print('Yes' if flag else 'No')