import sys

input = sys.stdin.readline

def pisano(x):
    if len(fb) > x:
        return fb[x]
    else:
        fb[x] = (pisano(x-1)+pisano(x-2)) % m
        return fb[x]


def cycle():
    x = 1
    while True:
        if fb[x] == 0 and fb[x-1] == 1:
            return x
        x += 1
        pisano(x)

for i in range(int(input())):
    fb = dict()
    fb[0] = 0
    fb[1] = 1
    fb[2] = 1
    a, m = map(int, input().split())
    print(a,cycle())
