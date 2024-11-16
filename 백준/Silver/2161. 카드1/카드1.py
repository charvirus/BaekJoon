cd = list(range(1,int(input())+1))
while 1:
    print(cd.pop(0),end=" ")
    if not cd:
        break
    cd.append(cd.pop(0))