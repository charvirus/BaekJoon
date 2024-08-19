import sys

input = sys.stdin.readline

N, M = map(int, input().split())
dict = dict()
for i in range(N):
    T, S, a1, a2, a3, a4, a5, a6, a7 = input().split()
    A = [a1, a2, a3]
    dict[S] = A

for i in range(M):
    sinp = input().split()
    count = 0
    title = ""
    for s in dict:
        if sinp == dict[s]:
            count += 1
            title = s
    if count >= 2:
        print("?")
    elif count==1:
        print(title)
    else:
        print("!")