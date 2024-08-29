import sys

input = sys.stdin.readline
gandalf = [1, 2, 3, 3, 4, 10]
sauron = [1, 2, 2, 2, 3, 5, 10]

inp = int(input().strip())
for x in range(inp):
    gandalfScore = 0
    sauronScore = 0
    gi = list(map(int, input().split()))
    si = list(map(int, input().split()))
    for i in range(len(gandalf)):
        gandalfScore += gi[i] * gandalf[i]
    for i in range(len(sauron)):
        sauronScore += si[i] * sauron[i]

    if gandalfScore > sauronScore:
        print('Battle {0}: Good triumphs over Evil'.format(x + 1))
    if gandalfScore == sauronScore:
        print('Battle {0}: No victor on this battle field'.format(x + 1))
    if gandalfScore < sauronScore:
        print('Battle {0}: Evil eradicates all trace of Good'.format(x + 1))
