for a in range(1, 10):
    # A가 a인지 물어보고 flush를 한다.
    # print에 flush 파라미터를 넣으면 된다.
    print("? A", a, flush=True)

    # 채점기의 답변을 입력받는다.
    resp = int(input())

    if resp == 1:
        # 답변이 "예"이므로 A의 값은 a이다.
        # B의 값도 알아내야 하는데, 이 부분은 직접 채워보자.
        b= 0
        for i in range(1,10):
            print("? B", i, flush=True)
            inp =  int(input())
            if inp == 1:
                b = i
                break
        print("!", a + b)
        break