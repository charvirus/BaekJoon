n = int(input())
l = int(input())
s = input()
idx = n * 2 + 1
chk = "IO" * n + "I"
cnt = 0

for i in range(0, l - idx+1):
    if s[i:i + idx] == chk:
        cnt += 1
print(cnt)
