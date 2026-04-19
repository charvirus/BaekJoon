import sys

input = sys.stdin.readline

price = 0
weigh = 0
for i in range(int(input())):
    T, W, H, L = input().split()
    W, H, L = int(W), int(H), int(L)
    if T == "A":
        price += (W // 12) * (H // 12) * (L // 12)
        weigh += 1000
    else:
        weigh += 6000
print(weigh + price * 500)
print(price * 4000)