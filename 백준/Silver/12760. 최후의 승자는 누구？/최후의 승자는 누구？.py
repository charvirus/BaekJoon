import sys

input = sys.stdin.readline

N, M = map(int, input().split())
rank = [0] * N
cards = []
for i in range(N):
    card = list(map(int, input().split()))
    card.sort(reverse=True)
    card.insert(0, i + 1)
    cards.append(card)

for i in range(M):
    cards.sort(key=lambda x: x[i + 1], reverse=True)
    top = cards[0][i+1]
    for j in range(N):
        if cards[j][i+1] == top:
            rank[cards[j][0]-1] += 1

top = max(rank)
for i in range(N):
    if rank[i] == top:
        print(i+1,end=" ")