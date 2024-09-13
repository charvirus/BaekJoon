import sys

input = sys.stdin.readline

money = int(input())
jmoney, smoney = money, money
junhyunSt, sungminSt = 0, 0
MachineDuck = list(map(int, input().split()))
before = 0
for i in range(14):
    if jmoney >= MachineDuck[i]:
        junhyunSt += int(jmoney / MachineDuck[i])
        jmoney %= MachineDuck[i]

    if 2 < i:
        if MachineDuck[i - 3] < MachineDuck[i - 2] < MachineDuck[i - 1]:
            smoney += sungminSt * MachineDuck[i]
            sungminSt = 0
        elif MachineDuck[i - 3] > MachineDuck[i - 2] > MachineDuck[i - 1]:
            sungminSt += int(smoney / MachineDuck[i])
            smoney = int(smoney % MachineDuck[i])
jmoney += junhyunSt * MachineDuck[-1]
smoney += sungminSt * MachineDuck[-1]

if jmoney > smoney:
    print("BNP")
elif jmoney == smoney:
    print("SAMESAME")
else:
    print("TIMING")