import sys

def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

input = sys.stdin.readline

for i in range(int(input())):
    m = 0
    inp = list(map(int,input().split()))
    for j in range(len(inp)):
        for k in range(j,len(inp)):
            if j != k :
                m = max(m,gcd(inp[j],inp[k]))
    print(m)