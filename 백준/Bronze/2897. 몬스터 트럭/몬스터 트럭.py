import sys

input = sys.stdin.readline

arr=[]
park=[]
res=[0]*5
R, C = map(int, input().split())
for i in range(R):
    arr.append(list(input().strip()))

for i in range(R-1):
    for j in range(C-1):
        park = [arr[i][j], arr[i+1][j], arr[i][j+1], arr[i+1][j+1]]
        if "#" in park:
            continue
        res[park.count("X")]+=1

print(*res,sep="\n")