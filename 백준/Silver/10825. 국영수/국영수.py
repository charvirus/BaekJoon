
n = int(input())
std = []
for _ in range(n):
    std.append(input().split())

std.sort(key=lambda x: (-int(x[1]), int(x[2]), -int(x[3]), x[0]))

for student in std:
    print(student[0])