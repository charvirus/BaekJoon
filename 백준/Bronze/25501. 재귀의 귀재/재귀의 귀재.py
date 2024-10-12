import sys

input = sys.stdin.readline

def rec(s,l,r,i):
    if l >= r:
        return f'1 {i}'
    elif s[l]!= s[r]:
        return f'0 {i}'
    else:
        return rec(s,l+1,r-1,i+1)
def is_pal(s):
    return rec(s,0,len(s)-1,1)

t = int(input())
for i in range(t):
    print(is_pal(input().strip()))