import sys

input = sys.stdin.readline

for i in range(int(input())):
    T = int(input())
    inl = len(str(T))

    powT = T*T
    if powT % (10**inl) == T:
        print("YES")
    else:
        print("NO")