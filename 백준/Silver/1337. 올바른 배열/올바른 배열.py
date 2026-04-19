import sys

input = sys.stdin.readline

N = int(input())
lst = [int(input()) for _ in range(N)]
lst.sort()
answer = 4

for i in range(N):
    st,en = i,N-1
    while st<en:
        if lst[en]-lst[st] > 4:
            en -= 1
        else:
            tmp_ans = 4 - (en-st)
            answer = min(answer,tmp_ans)
            break
print(answer)