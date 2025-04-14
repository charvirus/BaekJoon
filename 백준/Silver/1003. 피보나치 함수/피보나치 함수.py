for i in range(int(input())):
    n= int(input())
    a, b = 1, 0
    for j in range(n):
        a, b = b, a + b
    print(a, b)
