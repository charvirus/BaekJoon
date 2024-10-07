import sys

input = sys.stdin.readline

for i in range(int(input())):
    inp = input().strip()
    stk = []
    flag = False
    for i in inp:
        if i =="(":
            stk.append('(')
        else:
            if not stk:
                flag = True
                break
            else:
                stk.pop()

    if flag or stk:
        print("NO")
    else:
        print("YES")