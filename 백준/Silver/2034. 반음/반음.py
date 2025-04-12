import sys

input = sys.stdin.readline
piano = ['C', 'X', 'D', 'X', 'E', 'F', 'X', 'G', 'X', 'A', 'X', 'B']
arr = []
for i in range(int(input())):
    arr.append(int(input()))
    arr[i] %= 12

for i in range(65,72):
    alpah = chr(i)
    idx = piano.index(alpah)
    flag = True
    for j in arr:
        idx += j
        idx %= 12
        if piano[idx] == 'X':
            flag = False
            break
    if flag:
        print(f'{alpah} {piano[idx]}')