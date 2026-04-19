import sys
input = sys.stdin.readline

n = input().strip()

if "0" not in n:
    print(-1)
else:
    ns = 0
    for i in range(len(n)):
        ns += int(n[i])

    if ns % 3 != 0:
        print(-1)
    else:
        n = sorted(n,reverse=True)
        print("".join(n))