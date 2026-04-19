import sys
input = sys.stdin.readline

for i in range(int(input())):
    n = int(input())
    if n % 8 != 0:
        print('No')
    else:
        a = n // 8
        a = str(a)
        b = list(a)
        b.sort()
        b = ''.join(b)
        if '9' in a:
            print('No')
        elif b != a:
            print('No')
        else:
            print('Yes')