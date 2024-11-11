import math
N, S = map(int, input().split())
family = list(map(int, input().split()))
print(math.gcd(*[abs(d - S) for d in family]))