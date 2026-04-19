ans = 0
for i in range(int(input())):
    stk = []
    l = list(input())
    for j in l:
        if not len(stk):
            stk.append(j)
        elif stk[-1] == j:
            stk.pop(-1)
        else:
            stk.append(j)
    if not stk:
        ans += 1
print(ans)