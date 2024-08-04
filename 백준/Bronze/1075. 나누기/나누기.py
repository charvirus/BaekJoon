import sys

A = int(sys.stdin.readline().strip())//100*100
B = int(sys.stdin.readline().strip())

while A % B != 0:
    A += 1

if A % 100 < 10:
    print(0,A % 100,sep="")
else:
    print(A % 100)
