import sys

input = sys.stdin.readline

inp = input()
arr = ["a", "e", "i", "o", "u"]

ncnt = 0
ycnt = 0
for i in inp:
    if i in arr:
        ncnt += 1
        ycnt += 1
    if i == "y":
        ycnt+=1

print(ncnt,ycnt)