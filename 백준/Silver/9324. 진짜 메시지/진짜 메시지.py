for i in range(int(input())):
    chk = [0] * 26
    inp = input()
    l = len(inp)
    flag = True
    j = 0
    while j < l:
        pos = ord(inp[j]) - ord('A')
        chk[pos] += 1
        if chk[pos] == 3:
            if j == l - 1 or inp[j] != inp[j + 1]:
                flag = False
                break
            else:
                chk[pos] = 0
                j += 1
        j += 1
    if flag:
        print("OK")
    else:
        print("FAKE")
