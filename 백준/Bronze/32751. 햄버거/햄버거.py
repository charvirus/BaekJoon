import sys

input = sys.stdin.readline

N = int(input())
A, B, C, D = map(int, input().split())
S = input()

if S[0] != 'a' or S[N - 1] != 'a':
    print("No")
    exit()
for i in range(1, N):
    if S[i] == S[i - 1]:
        print("No")
        exit()
cnt_a = S.count('a')
cnt_b = S.count('b')
cnt_c = S.count('c')
cnt_d = S.count('d')
if cnt_a > A or cnt_b > B or cnt_c > C or cnt_d > D:
    print("No")
    exit()
print("Yes")

