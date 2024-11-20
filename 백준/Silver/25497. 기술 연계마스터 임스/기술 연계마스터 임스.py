n = int(input())
sk = input()
st = []
c = 0
for i in sk:
    if i == 'L' or i == 'S':
        st.append(i)
    elif '0' <= i <= '9':
        c += 1
    else:
        if i == 'R':
            if 'L':
                st.remove('L')
                c += 1
            else:
                break
        elif i == 'K':
            if 'S' in st:
                st.remove('S')
                c += 1
            else:
                break
print(c)