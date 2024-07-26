A = input()
B = input()
alpha = [3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1]
size = len(A) * 2 - 1
arr = [[0 for i in range(2 * len(A))] for j in range(2 * len(A) - 1)]

for i in range(len(A)):
    arr[0][i * 2] = alpha[ord(A[i]) - 65]
    arr[0][i * 2 + 1] = alpha[ord(B[i]) - 65]

for i in range(1, len(A) * 2 - 1):
    for j in range(size):
        arr[i][j] = (arr[i - 1][j] + arr[i - 1][j + 1]) % 10
    size -= 1
print(arr[-1][0],arr[-1][1],sep='')
