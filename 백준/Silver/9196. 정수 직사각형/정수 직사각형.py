import sys

input = sys.stdin.readline

all_square = []

for h in range(1, 151):
    for w in range(h, 151):
        if h == w:
            continue
        all_square.append([h, w])

all_square.sort(key=lambda x: x[0] ** 2 + x[1] ** 2)

while True:
    square = list(map(int, input().split()))
    if square == [0, 0]:
        break

    index = all_square.index(square)
    print(' '.join(map(str, all_square[index + 1])))