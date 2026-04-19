N = int(input())
arr = list(map(int, input().split()))
T, P = map(int, input().split())
cnt = 0
for i in range(6):
    cnt += int((arr[i] / T)) + (0 if arr[i] % T == 0 else 1)

print(cnt)
print(int(N / P), N % P)
