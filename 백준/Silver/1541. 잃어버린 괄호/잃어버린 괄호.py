n = input()
m = n.split('-')
result = 0

x = sum(map(int, m[0].split('+')))
if m[0] =='-':
    result -= x
else:
    result = x

for i in m[1:]:
    result -= sum(map(int, i.split('+')))
print(result)