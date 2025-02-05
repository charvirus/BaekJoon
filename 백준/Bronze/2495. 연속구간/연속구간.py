for i in range(3):
    inp = input()
    cnt = 1
    m = 0
    for j in range(1,8):
        if inp[j-1] == inp[j]:
            cnt += 1
        else:
            cnt = 1
        m = max(cnt,m)
    print(m)