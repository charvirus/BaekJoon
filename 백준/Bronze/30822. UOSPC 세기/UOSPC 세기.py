input()
n = input()
p = [0]*5
for i in n:
    if i == 'u':
        p[0]+=1
    elif i == 'o':
        p[1]+=1
    elif i == 's':
        p[2] += 1
    elif i == 'p':
        p[3]+=1
    elif i == 'c':
        p[4]+=1

print(min(p))