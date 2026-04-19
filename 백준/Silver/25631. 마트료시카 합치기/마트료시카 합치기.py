n = int(input())
mat = sorted(list(map(int, input().split())))
cnt = 0
ms = list(set(mat))
while mat:
    idx = 0
    ms = set(mat)
    for i in ms:
        while idx < len(mat):
            if i == mat[idx]:
                mat.pop(idx)
                idx += 1
                break
            idx += 1
        idx = 0
    cnt += 1
print(cnt)
