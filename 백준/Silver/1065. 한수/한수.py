import sys

input = sys.stdin.readline

inp = int(input())
cnt = 0
for i in range(1, inp + 1):
    if i < 100:
        cnt += 1
    else:
        chk1 = int(str(i)[0]) - int(str(i)[1])
        chk2 = int(str(i)[1]) - int(str(i)[2])
        if chk1 == chk2:
            cnt += 1
print(cnt)
