import sys

input = sys.stdin.readline

for i in range(int(input())):
    R, A = 0, 0
    while True:
        line = sys.stdin.readline().rstrip()
        if line == '':
            break
        for i in line:
            if i == '#':
                A += 1
            else:
                A += 1
                R += 1

    ans = round(R/A*100, 1)
    if not ans % 1:
        ans = int(ans)
    print(f'Efficiency ratio is {ans}%.')
