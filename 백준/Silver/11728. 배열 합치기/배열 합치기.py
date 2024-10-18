X, Y = map(int, input().split())
arr = []
for i in range(2):
    arr+=list(map(int,input().split()))

arr.sort()

print(*arr)