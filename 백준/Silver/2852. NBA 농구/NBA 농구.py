import sys

input = sys.stdin.readline
flag = 0
oteam1, oteam2 = 0, 0
for _ in range(int(input())):
    inp = input()
    team = inp.split()[0]
    time = inp.split()[1]
    M, S = map(int, time.split(":"))
    if team == '1':
        if flag == 0:
            oteam1 += 48 * 60 - (60 * M + S)
        flag += 1
        if flag == 0:
            if oteam2 > 0:
                oteam2 = oteam2 - (48 * 60 - (60 * M + S))
    else:
        if flag == 0:
            oteam2 += 48 * 60 - (60 * M + S)
        flag -= 1
        if flag == 0:
            if oteam1 > 0:
                oteam1 = oteam1 - (48 * 60 - (60 * M + S))
print('{:0>2}:{:0>2}'.format(oteam1 // 60, oteam1 % 60))
print('{:0>2}:{:0>2}'.format(oteam2 // 60, oteam2 % 60))
