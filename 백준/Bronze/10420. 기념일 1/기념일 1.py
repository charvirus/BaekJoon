y = 2014
m = 4
d = 1

inp = int(input())

while inp:
    inp -= 1
    d += 1
    if m in [1, 3, 5, 7, 8, 10]:
        if d == 32:
            m += 1
            d = 1
    elif m in [4, 6, 9, 11]:
        if d == 31:
            m += 1
            d = 1
    elif m == 12:
        if d == 32:
            y += 1
            d = 1
            m = 1
    elif m == 2:
        ch = False
        if (y % 4 == 0 and y % 100 != 0) or y % 400 == 0:
            ch = True
        if not ch and d == 29:
            m += 1
            d = 1
        if ch and d == 30:
            m += 1
            d = 1
print('{0:d}-{1:02d}-{2:02d}'.format(y,m,d))

