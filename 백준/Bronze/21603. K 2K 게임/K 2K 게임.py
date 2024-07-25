N, K = map(int, input().split())
numlist = []
for i in range(1, N + 1):
    if not (K % 10 == i % 10 or (2 * K) % 10 == i % 10):
        numlist.append(i)

print(len(numlist))
print(*numlist)
