import sys

input = sys.stdin.readline

N, M = map(int, input().split())
passed = []
passSet = set()
for i in range(N):
    inp = input().replace(" ","")
    name = inp[M:]
    inp = inp[:M].split("*")
    maxStreak = max([len(i) for i in inp])
    passed.append(f'{maxStreak} {name}')
    passSet.add(maxStreak)
print(len(passSet))
print(''.join(passed))