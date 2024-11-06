import sys
input = sys.stdin.readline
D = input().strip()
t = input().strip() + input().strip()
ans = [".OP.", "I..P", "O..P"]
if D == "E":
    t = t[2] + t[0] + t[3] + t[1]
elif D == "W":
    t = t[1] + t[3] + t[0] + t[2]
elif D == "N":
    t = t[3] + t[2] + t[1] + t[0]
if t == ans[0]:
    print("T")
elif t == ans[1]:
    print("F")
elif t == ans[2]:
    print("Lz")
else:
    print("?")