import sys
input = sys.stdin.readline

n, k = map(int,input().split())
ast = list(map(int,input().split()))
bst = list(map(int,input().split()))
asum = sum(ast)
bsum = sum(bst)

while k>0:
    if asum > bsum:
        asum -= ast.pop()
    else:
        bsum -= bst.pop()
    k-=1

print(max(asum,bsum))