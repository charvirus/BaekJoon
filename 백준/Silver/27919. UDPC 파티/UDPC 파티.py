import sys

N = sys.stdin.readline().strip()
UC, DP = 0, 0
ans = ""
for i in N:
    if i == 'U' or i == 'C':
        UC += 1
    else:
        DP += 1

if (DP + 1) / 2 < UC:
    ans += "U"
if DP > 0:
    ans += "DP"

print(ans)