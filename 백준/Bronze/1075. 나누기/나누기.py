import sys

A = int(sys.stdin.readline().strip())//100*100
B = int(sys.stdin.readline().strip())

while A % B != 0:
    A += 1

print(str(A)[-2:])
