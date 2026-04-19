import sys

input = sys.stdin.readline

l = []
for i in range(int(input())):
    name, day, month, year = input().split()
    day, month, year = int(day), int(month), int(year)
    l.append([name, day, month, year])

l.sort(key=lambda x:(-x[3],-x[2],-x[1]))

print(l[0][0], l[len(l)-1][0],sep='\n')