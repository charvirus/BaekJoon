N = int(input())
time = 1001
for _ in range(N):
    A, B = map(int, input().split())
    if A <= B:
        time = min(time,B)

print(-1 if time == 1001 else time)