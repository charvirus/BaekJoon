import sys
from itertools import permutations

input = sys.stdin.readline

scores = list(map(int, input().split()))
perms = list(permutations(scores))

def get_satisfaction(team_score_list):
    return 1 - (abs((team_score_list[0] + team_score_list[1]) / 2 - (team_score_list[2] + team_score_list[3]) / 2) / 10)

answer = 0

for per in perms:
    team1_satisfaction = get_satisfaction(per[:4])
    team2_satisfaction = get_satisfaction(per[4:])

    min_satisfaction = min(team1_satisfaction, team2_satisfaction)
    if answer < min_satisfaction:
        answer = min_satisfaction

print(answer)