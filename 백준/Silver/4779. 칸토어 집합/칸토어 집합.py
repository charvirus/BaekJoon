def cantor_set(start, length):
    if length == 1:
        return
    for i in range(start + length // 3, start + (length // 3) * 2):
        line[i] = ' '
    cantor_set(start, length // 3)
    cantor_set(start + (length // 3) * 2, length // 3)

import sys

input = sys.stdin.readline
while True:
    try:
        N = int(input())
        line = ['-'] * 3 ** N
        cantor_set(0, 3 ** N)
        print(''.join(line))
    except:
        break
