import sys
input  = sys.stdin.readline

while True:
    try:
        k = 0
        n = input().rstrip()
        s = set(list(n))
        num = 0
        while len(s) < 10:
            num += int(n)
            check = set(list(str(num)))
            s = s.union(check)
            k += 1

        print(k)
    except:
        break