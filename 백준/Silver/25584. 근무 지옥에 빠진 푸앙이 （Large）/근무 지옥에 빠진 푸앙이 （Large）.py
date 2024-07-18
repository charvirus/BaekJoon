dict = dict()
N = int(input())

for i in range(N):
    for j in range(4):
        inp = list(map(str, input().split()))
        for k in range(7):
            name = inp[k]
            if name == "-":
                continue

            workTime = 0
            if j == 0 or j == 2:
                workTime = 4
            elif j == 1:
                workTime = 6
            else:
                workTime = 10

            if name in dict:
                dict[name] += workTime
            else:
                dict[name] = workTime

max = -1
min = 100000000

for i in list(dict.values()):
    if max < i:
        max = i
    if min > i:
        min = i

if max - min > 12:
    print("No")
else:
    print("Yes")
