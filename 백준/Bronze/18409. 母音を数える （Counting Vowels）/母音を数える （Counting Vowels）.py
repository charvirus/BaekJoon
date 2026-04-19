n = int(input())

st = input()

cnt = 0

for i in st:

    if i in ['a', 'e', 'i', 'o', 'u']:

        cnt += 1

print(cnt)