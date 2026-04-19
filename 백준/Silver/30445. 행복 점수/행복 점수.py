import math

s = list(input().split())
ph = 0
ps = 0

for i in s:
    for j in i :
        if j in ['S','A','D']:
            ps += 1
        if j in ['H','A','P','Y']:
            ph += 1
if ph == 0 and ps == 0:
    print("50.00")
else:
    print(f'{round((ph/(ph+ps)+0.000000001)*100, 2) :.2f}')