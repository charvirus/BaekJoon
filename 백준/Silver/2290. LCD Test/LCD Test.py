s, n = input().split()
s = int(s)
h, v = '-', '|'


def cons_seg(n):
    temp = [[' '] * (s + 2) for k in range(2 * s + 3)]
    for i in range(1, s + 1):
        if n in "02356789":
            temp[0][i] = h
        if n in "01234789":
            temp[i][-1] = v
        if n in "013456789":
            temp[s + 1 + i][-1] = v
        if n in "0235689":
            temp[2 * s + 2][i] = h
        if n in "0268":
            temp[s + 1 + i][0] = v
        if n in "045689":
            temp[i][0] = v
        if n in "2345689":
            temp[s + 1][i] = h
    return temp


res = [cons_seg(i) for i in n]

for line in zip(*res):
    for r in line:
        print(''.join(r), end=' ')
    print()
