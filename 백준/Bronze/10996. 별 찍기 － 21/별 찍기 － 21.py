x = int(input())
if x == 1:
    print("*")
else:
    for i in range(x):
        for j in range(2):
            for k in range(x):
                if (k + j) % 2 == 0:
                    print("*", end='')
                else:
                    print(" ", end='')
            print()