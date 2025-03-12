import sys

input = sys.stdin.readline

T, name = input().split()

cnt = 0
for i in range(int(T)):
    n, q = input().split()
    nr = n.split('_')
    for j in nr:
        if name == j:
            cnt += int(q)
            break
print(cnt)