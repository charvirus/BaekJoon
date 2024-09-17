import sys

input = sys.stdin.readline

time = int(input())
for _ in range(time):
    n = int(input())
    first = list(input().split())
    second = list(input().split())
    cipher = list(input().split())
    num = []
    for i in range(n):
        for j in range(n):
            if first[i] == second[j]:
                num.append(j)

    for i in num:
        print(cipher[i],end=" ")