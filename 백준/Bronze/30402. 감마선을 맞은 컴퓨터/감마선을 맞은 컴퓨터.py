import sys

input = sys.stdin.readline

l = [0,0,0]

for i in range(15):
    inp = list(input().split())
    for j in inp:
        if j == "w":
            l[0] += 1
        elif j == "b":
            l[1] += 1
        elif j == "g":
            l[2] += 1
lmx = max(l)

for i in range(3):
    if l[i] == lmx:
        if i == 0 :
            print("chunbae")
        elif i == 1:
            print("nabi")
        else:
            print("yeongcheol")