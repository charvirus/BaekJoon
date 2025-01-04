import sys
input = sys.stdin.readline

while True:
    x = input().strip()
    if x == "0":
        break
    mx = 0

    for i in range(len(x)-1):
        for j in range(i+1,len(x)+1):
            flag = False
            c  = int(x[i:j])
            if c % 2 == 0 and c > 2:
                continue
            else:
                for k in range(2,int(c**(1/2))+1):
                    if c % k == 0:
                        flag = True
                        break

                if not flag and 100000 >= c >= mx :
                    mx = c
    print(mx)