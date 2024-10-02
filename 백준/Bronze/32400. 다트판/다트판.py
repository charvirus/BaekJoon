import sys

input = sys.stdin.readline

d = [*map(int, input().split())]
i = d.index(20)
A = (20 + d[(i + 1) % 20] + d[i - 1]) / 3

print("Alice" if A > 10.5 else "Tie" if A == 10.5 else "Bob")