import sys

input = sys.stdin.readline

N = int(input())
p = list(map(int,input().split()))
exam = [list(map(int,input().split()))for i in range(N)]
ans = 0
exam.sort()

bq,bt  = 1,0
first = True

for i, j in exam:
    if p[i-1] > 0:
        ans += j
        p[i-1] -= 1

        if first :
            first = False
        elif bq == i:
            ans += (j-bt)
        elif bq != i :
            ans += 60
        bq = i
        bt = j
print(ans)