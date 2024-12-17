import sys

input = sys.stdin.readline

n, m = map(int, input().split())
trees = sorted(list(map(int, input().split())))
s, e = 0, max(trees)

while s <= e:
    mid = (s + e) // 2
    cnt = 0
    for tree in trees:
        if tree > mid:
            cnt += tree - mid
    if cnt >= m:
        s = mid  + 1
    else:
        e = mid - 1
print(e)