import sys

input = sys.stdin.readline

def solution(t):
    ans = [0] * len(t)
    stack = []
    for i, cur in enumerate(t):
        while stack and cur > t[stack[-1]]:
            # cur > t[stack[-1]] : 다음 날이 더운지 비교
            last = stack.pop()
            ans[last] = i - last
        stack.append(i)
    return ans


print(solution([73,74,75,71,69,72,76,73]))
