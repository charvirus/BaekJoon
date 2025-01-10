from random import shuffle

num_li = list(range(1, 10001))
shuffle(num_li)

while 1:
    ranA = num_li.pop()
    print("? A", ranA, flush=True)
    resp = int(input())

    if resp == 1:
        num_li = list(range(1, 10001))
        shuffle(num_li)
        ranB = 0
        while 1:
            ranB = num_li.pop()
            print("? B", ranB, flush=True)
            inp = int(input())
            if inp == 1:
                print("!", ranA + ranB, flush = True)
                break
        break