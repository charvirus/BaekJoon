n0= int(input())
n1 = map(int,input().split())
count = 0
for i in n1: count += i
if count > 0:print("Right")
elif count ==0: print("Stay")
else: print("Left")