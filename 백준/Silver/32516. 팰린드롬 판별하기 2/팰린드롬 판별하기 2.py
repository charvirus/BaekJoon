N = int(input())
S = input()
K = 0
for i in range(N // 2):
    if S[-(i + 1)] == "?" and S[i] == "?":
        K += 26
    elif S[-(i + 1)] == "?" or S[i] == "?":
        K += 1
    elif S[-(i + 1)] != S[i]:
        print(0)
        quit()
print(K)