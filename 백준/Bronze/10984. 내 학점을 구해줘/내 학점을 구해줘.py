import sys
input = sys.stdin.readline

for i in range(int(input())):
    t = int(input())
    sb = 0
    sc = 0
    for j in range(t):
        c,g = map(float, input().split())
        sb += c
        sc += c*g
    gpa = sc/sb
    print(int(sb), '%.1f' %gpa)
