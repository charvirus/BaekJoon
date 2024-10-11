k = input()
print(min(len(k.replace('0',' ').split()),
          len(k.replace('1',' ').split())))