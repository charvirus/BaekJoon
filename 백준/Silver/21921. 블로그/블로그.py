import sys

input = sys.stdin.readline

n,x = map(int,input().split())
l = list(map(int,input().split()))

top = sum(l[:x])
win = sum(l[:x])
cnt = 1
for i in range(n-x):
    win = win - l[i] + l[i+x]
    if top < win:
        cnt = 1
        top = win
    elif top == win:
        cnt += 1
if top :
    print(top,cnt,sep="\n")
else:
    print("SAD")