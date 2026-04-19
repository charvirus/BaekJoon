import sys
input = sys.stdin.readline

inp = input().strip()
bomb = list(input().strip())

st = []

for i in range(len(inp)):
    st.append(inp[i])
    if st[-len(bomb):] == bomb:
        del st[-len(bomb):]

print("".join(st) if st else "FRULA")