N = int(input())
cards = list(range(1,N+1))
while 1:
    print(cards.pop(0),end=" ")
    if not cards:
        break
    cards.append(cards.pop(0))