import sys

input = sys.stdin.readline

dart = list(map(int, input().split()))
Alice = 0
twentIdx = dart.index(20)
if twentIdx == 19:
    Alice =(20 + dart[0] + dart[twentIdx - 1]) / 3
else:
    Alice = (20 + dart[twentIdx + 1] + dart[twentIdx - 1]) / 3
Bob = sum(dart) / len(dart)
print("Alice" if Alice > Bob else "Tie" if Alice == Bob else "Bob")
