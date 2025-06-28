n = int(input())
rest = []
for i in range(2,11):
    temp = n
    res = ""
    while temp > 0:
        res += str(temp % i)
        temp //= i
    if res == res[::-1]:
        rest.append([i,res])
if rest:
    for i in rest:
        print(i[0],i[1])
else:
    print('NIE')