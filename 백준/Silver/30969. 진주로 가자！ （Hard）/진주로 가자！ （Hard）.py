import sys

input = sys.stdin.readline

arr = [0] * 1001
cnt = 0
price = 0
for i in range(int(input())):
    place, fee = input().split()
    fee = int(fee)
    if place == "jinju":
        price = fee
    elif fee > 1000:
        cnt += 1
    else:
        arr[fee]+=1
for i in range(price+1,1001):
    cnt += arr[i]
print(price)
print(cnt)
