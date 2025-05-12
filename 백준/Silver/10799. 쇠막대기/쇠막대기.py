n = input()
stk=[]
cnt = 0
for i in range(len(n)):
    if n[i] == '(':
        stk.append("(")
    else:
        if n[i-1] == "(":
            stk.pop()
            cnt += len(stk)
        else:
            stk.pop()
            cnt+=1
print(cnt)