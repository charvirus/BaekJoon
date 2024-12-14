import sys
input = sys.stdin.readline

res, st = 0,[]
for i in range(int(input())):
    cmd = list(map(int, input().split()))
    if cmd[0] == 1:
        st.append((cmd[1],cmd[2]))

    if st:
        sc,ti = st.pop()
        ti -= 1
        if ti == 0:
            res += sc
        else:
            st.append((sc,ti))
print(res)