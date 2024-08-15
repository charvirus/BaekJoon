import sys

input = sys.stdin.readline

n = int(input().strip())

crewvote = list(map(int, input().split()))

crew = [0] * (n + 1)
for i in crewvote:
    if i != 0:
        crew[i] += 1

if crew.count(max(crew)) == 1:
    print(crew.index(max(crew)))
else:
    print("skipped")
