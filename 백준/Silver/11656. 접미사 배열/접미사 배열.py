n = input()
l = []
for i in range(len(n)):
    l.append(n[i:])
print('\n'.join(sorted(l)))