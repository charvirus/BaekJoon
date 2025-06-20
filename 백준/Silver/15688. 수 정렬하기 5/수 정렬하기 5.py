import sys
input = sys.stdin.readline
M=[]
for _ in range(int(input())):
    M.append(int(input()))
for i in sorted(M):
    print(i)