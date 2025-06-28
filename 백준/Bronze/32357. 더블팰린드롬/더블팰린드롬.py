cnt = 0
for i in range(int(input())):
    n = input()
    if n[::] == n[::-1]:
        cnt += 1
print(cnt * (cnt-1))