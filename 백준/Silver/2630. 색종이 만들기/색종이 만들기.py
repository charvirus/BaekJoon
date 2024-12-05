import sys

input = sys.stdin.readline

w, b = 0, 0


def dnc(y, x, n):
    global w, b
    tmp = 0
    for i in range(y, y + n):
        for j in range(x, x + n):
            if arr[i][j]:
                tmp += 1
    if not tmp:
        w += 1
    elif tmp == n ** 2:
        b += 1
    else:
        dnc(y, x, n // 2)
        dnc(y + n // 2, x, n // 2)
        dnc(y, x + n // 2, n // 2)
        dnc(y + n // 2, x + n // 2, n // 2)


N = int(input())
arr = [list(map(int, input().split())) for i in range(N)]
dnc(0, 0, N)
print(w,b,sep='\n')