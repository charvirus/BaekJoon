import sys

input = sys.stdin.readline
N = int(input())
cd = [0]
cd.extend(list(map(int, input().split())))
cd.extend([0])
for i in range(1, N+1):
    if cd[i] == 0:
        for j in range(1,4):
            if cd[i - 1] != j and cd[i+1] != j:
                cd[i] = j
                break
    elif cd[i] == cd[i+1]:
        print(-1)
        exit()
print(*cd[1:N+1])
