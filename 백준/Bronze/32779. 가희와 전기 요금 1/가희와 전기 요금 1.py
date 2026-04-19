import sys
input = sys.stdin.readline

n = int(input())
for i in range(n):
    a,b = map(int,input().split())
    fee = a*b*105.6
    print(int(fee//60000))
