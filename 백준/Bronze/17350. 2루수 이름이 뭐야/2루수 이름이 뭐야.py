flag = False
for i in range(int(input())):
    n = input()
    if n == "anj":
        flag = True

print("뭐야;" if flag else "뭐야?")