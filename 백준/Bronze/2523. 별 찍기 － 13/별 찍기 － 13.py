import sys

input = sys.stdin.readline

inp = int(input())
for i in range(1,inp + 1):
    print("*" * i)
    
for i in range(inp - 1, 0,-1):
    print("*" * i)
