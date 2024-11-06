import sys
input = sys.stdin.readline

D = input().strip()
t = ""
for i in range(2):
    t += input().strip()
ans = [".OP.", "I..P", "O..P"]
if D == "E":
    t = t[2] + t[0] + t[3] + t[1]
elif D == "W":
    t = t[1] + t[3] + t[0] + t[2]
elif D == "N":
    t = t[3] + t[2] + t[1] + t[0]
else:
    t=t
for i in range(3):
    if t == ans[i]:
        if i == 0:
            print("T")
        if i == 1:
            print("F")
        if i == 2:
            print("Lz")
        exit()
print("?")