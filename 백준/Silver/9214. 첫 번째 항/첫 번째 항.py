import sys

input = sys.stdin.readline


def string(inp):
    result = ""
    slen = len(inp)
    if slen % 2 == 1:
        return inp
    for i in range(0, slen, 2):
        result += inp[i + 1] * int(inp[i])
    if result == inp:
        return result
    return string(result)

i = 0
while True:
    i += 1
    inp = input().strip()
    if int(inp) == 0:
        break
    else:
        print(f'Test {i}: {string(inp)}')
