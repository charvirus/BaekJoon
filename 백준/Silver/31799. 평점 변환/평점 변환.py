import sys

input = sys.stdin.readline

N = int(input().strip())
strInp = input().strip()
newScore = []
newChange = []
newIdx = 0

i = 0

while i < len(strInp):
    flag = False
    if strInp[i].isalpha():
        if strInp[i] == "A":
            newScore.append(2)
        elif strInp[i] == "B":
            newScore.append(5)
        else:
            newScore.append(8)
    if i != len(strInp) - 1:
        if strInp[i + 1] == "+" or strInp[i + 1] == "-" or strInp[i + 1] == "0":
            if strInp[i + 1] == "+":
                newScore[newIdx] += 1
            elif strInp[i + 1] == "-":
                newScore[newIdx] -= 1
            i += 2
        else:
            i += 1
    else:
        break
    newIdx += 1

i = 0
while i < len(newScore):
    if 7 <= newScore[i] <= 9:
        newChange.append("B")
    elif 4 <= newScore[i] <= 5:
        if i == 0 or 7 <= newScore[i - 1] <= 9:
            newChange.append("D")
        elif 1 <= newScore[i - 1] <= 6:
            newChange.append("B")
    elif newScore[i] == 1 or newScore[i] == 6:
        if i == 0 or (4 <= newScore[i - 1] <= 5 or 7 <= newScore[i - 1] <= 9):
            newChange.append("P")
        elif 1 <= newScore[i - 1] <= 3 or newScore[i - 1] == 6:
            newChange.append("D")
    elif newScore[i] == 2:
        if i == 0 or (1 == newScore[i - 1] or 4 <= newScore[i - 1] <= 9):
            newChange.append("E")
        elif 2 <= newScore[i - 1] <= 3:
            newChange.append("P")
    elif newScore[i] == 3:
        newChange.append("E")
    i += 1

for i in newChange:
    print(i, end="")
