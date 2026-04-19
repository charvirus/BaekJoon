import sys
input = sys.stdin.readline


x = int(input())
a,b,c = map(int,input().split())
print("high speed rail" if x<=a+b+c or x<=240 else "flight")