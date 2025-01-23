import sys
input = sys.stdin.readline

n = int(input())
pic = []
for i in range(n):
    pic.append(list([input().rstrip() for _ in range(5)]))
a = []
for i in range(n-1):
    for j in range(i+1,n):
        temp = 0
        for y in range(5):
            for x in range(7):
                if pic[i][y][x] != pic[j][y][x]:
                    temp += 1
        a.append((temp,i+1,j+1))
res = min(a)

print(res[1],res[2])