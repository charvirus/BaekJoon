import sys
input = sys.stdin.readline

for _ in range(int(input())):
    input()
    input().split()
    al = sorted(list(map(int,input().split())))
    bl = sorted(list(map(int,input().split())))
    while al and  bl:
        if al[-1] >= bl[-1]:
            bl.pop(0)
        else:
            al.pop(0)
    if al:
        print("S")
    elif bl:
        print("B")
    else:
        print("C")