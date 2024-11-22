import sys

input = sys.stdin.readline

res = []
while True:
    n, m = map(int, input().split())
    if n == 0 and m == 0:
        break

    call = [[*map(int, input().split()[2:])] for _ in range(n)]
    tap = [[*map(int, input().split())] for _ in range(m)]

    for a, b in tap:
        cnt = 0
        for c, d in call:
            # 통화 시작 시간 <= 도청 시작 시간 < 통화 끝나는 시간
            # 도청 시작 시간 <= 통화 시작 시간 < 도청 끝나는 시간
            if a <= c < a + b or c <= a < c + d:
                cnt += 1
        res.append(cnt)
print(*res, sep="\n")
