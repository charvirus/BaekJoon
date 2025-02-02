while 1:
    try:
        A, B = map(int, input().split())
        cnt = A
        lf = A
        while lf >= B:
            cnt += lf // B
            lf = lf // B + lf % B
        print(cnt)
    except EOFError:
        break