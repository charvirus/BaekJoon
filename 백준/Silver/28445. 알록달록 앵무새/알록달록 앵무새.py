clr = sorted(list(set(input().split() + input().split())))
for i in range(len(clr)):
    for j in range(len(clr)):
        print(clr[i],clr[j])