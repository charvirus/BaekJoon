import sys

input = sys.stdin.readline

arr = []
cnt = 0
price = 0
for i in range(int(input())):
    place, fee = input().split()
    if place == "jinju":
        price = int(fee)
    arr.append(int(fee))
for i in arr:
    if i > price:
        cnt +=1

print(price)
print(cnt)
