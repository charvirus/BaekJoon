import sys

input = sys.stdin.readline

N, L, R = map(int, input().split())
A = list(map(int, input().split()))
chk = sorted(A[L - 1:R])
if (L > 1 and A[L - 2] > chk[0]) or (R < N and A[R] < chk[-1]):
    print(0)
else:
    print(1)