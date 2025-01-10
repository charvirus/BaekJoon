from collections import Counter

n = input()
lst =  Counter([n[i:i+3]for i in range(0,len(n),3)])

l = [0,0,0,0]

for c in lst:
    if lst[c] != 1:
        print("GRESKA")
        exit()
    else:
        idx = c[0]
        if idx[0] == "P":
            l[0]+=1
        elif idx[0] == "K":
            l[1]+=1
        elif idx[0]=="H":
            l[2]+=1
        elif idx[0] =="T":
            l[3] += 1
for i in l:
    print(13 - i,end=" ")