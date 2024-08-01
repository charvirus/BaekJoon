A = int(input())
B = list(map(int, input().split()))
cnt = 0
chk = 0
ans = 0
for i in B:
    if i != 0:
        cnt += 1
        chk = 0
    elif i == 0 and chk < 1:
        chk += 1
    else:
        cnt = 0
    ans = max(ans,cnt)
print(ans)