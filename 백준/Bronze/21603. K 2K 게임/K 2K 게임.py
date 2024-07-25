N, K = map(int, input().split())
numlist = []
cnt = 0
for i in range(1, N + 1):
    if not (K % 10 == i % 10 or 2 * (K % 10) == i % 10):
        cnt += 1
        numlist.append(i)

print(cnt)
print(*numlist)