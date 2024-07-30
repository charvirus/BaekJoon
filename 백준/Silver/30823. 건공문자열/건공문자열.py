N, K = map(int, input().split())
S = input()

if K == 1:
    print(S)
elif (N - K + 1) % 2 == 0:
    print(S[K - 1:] + S[:K - 1])
else:
    print(S[K - 1:] + S[K - 2::-1])
