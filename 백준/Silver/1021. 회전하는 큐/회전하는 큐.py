from collections import deque

n,m = map(int,input().split())
data =  deque([i for i in range(1,n+1)])
l = list(map(int,input().split()))

cnt = 0
for i in l :
    while True :
        if data[0] == i:
            data.popleft()
            break
        else:
            if data.index(i) <= len(data)//2:
                data.rotate(-1)
                cnt += 1
            else:
                data.rotate(1)
                cnt += 1
print(cnt)