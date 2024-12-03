import sys

input = sys.stdin.readline


def fac(x):
    facs = []
    for i in range(1, x + 1):
        if x % i == 0:
            facs.append(i)
    return facs

for i in range(int(input())):
    inp = int(input())
    facts = fac(inp)
    flag = True
    if sum(fac(inp)) - inp <= inp:
        print("BOJ 2022")
        flag = False
    else:
        for j in range(len(facts) - 1):
            if sum(fac(facts[j])) - facts[j] > facts[j]:
                print('BOJ 2022')
                flag = False
                break
        if flag:
            print('Good Bye')