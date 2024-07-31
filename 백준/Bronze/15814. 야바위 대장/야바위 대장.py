inp = input()
T = int(input())
inp = list(inp)
for _ in range(T):
    A, B = map(int, input().split())
    temp = inp[A]
    inp[A] = inp[B]
    inp[B] = temp

for i in inp:
    print(i, end="")
