n = int(input())
l = list(map(int, input().split()))
rel, abs = map(int, input().split())

r, a = 0, 0
for i in l:
    if i >= abs:
        a += 1
print(int(n*(rel*0.01)),a)