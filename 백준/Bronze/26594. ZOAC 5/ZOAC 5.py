inp = input()
cnt = 1
for i in range(len(inp)-1):
    if inp[i] == inp[i + 1]:
       cnt+=1
    else:
        break

print(cnt)