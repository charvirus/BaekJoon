import sys

input = sys.stdin.readline
N = int(input())
QP=[]
for i in range(N):
    qp=list(map(int,input().split()))
    QP.append(qp)

QP.sort(key=lambda x:(-x[0],x[1]))
print(f'{QP[0][0]} {QP[0][1]} {QP[1][0]} {QP[1][1]}')

QP.sort(key=lambda x:x[1])
print(f'{QP[0][0]} {QP[0][1]} {QP[1][0]} {QP[1][1]}')