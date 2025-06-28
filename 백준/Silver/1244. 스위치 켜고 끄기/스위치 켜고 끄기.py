import sys

input = sys.stdin.readline

n = int(input())

l = [-1] + list(map(int, input().split()))
m = int(input())


def change(num):
    if l[num] == 0:
        l[num] = 1
    else:
        l[num] = 0
    return


for i in range(m):
    gen, num = map(int, input().split())
    if gen == 1:
        for j in range(num, n + 1, num):
            change(j)
    else:
        change(num)
        for j in range(n // 2):
            if num + j > n or num - j < 0:
                break
            if l[num + j] == l[num - j]:
                change(num + j)
                change(num - j)
            else:
                break
for i in range(1, n + 1):
    print(l[i],end=' ')
    if not i % 20:
        print()