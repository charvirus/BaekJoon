import sys

input = sys.stdin.readline

n, m = map(int, input().split())
info = [{} for i in range((int(m)) // 7)]
for i in range(n):
    name, day, hm, ehm = input().split()
    h1, m1 = map(int, hm.split(":"))
    h2, m2 = map(int, ehm.split(":"))
    start = h1 * 60 + m1
    end = h2 * 60 + m2
    duration = end - start
    w = (int(day) - 1) // 7
    if name not in info[w]:
        info[w][name] = [1, duration]
    else:
        info[w][name][0] += 1
        info[w][name][1] += duration
cnt = 0
real_vtb = set()
fail_vtb = set()
fst_week = list(info[0].keys())
for data in info:
    for vtb, (days,time) in data.items():
        if (days>= 5 and time >= 3600) and (vtb not in fail_vtb):
            real_vtb.add(vtb)
        else:
            fail_vtb.add(vtb)
            if vtb in real_vtb:
                real_vtb.remove(vtb)
    temp = list(real_vtb)
    for i in temp:
        if i not in fst_week or i not in data.keys():
            real_vtb.remove(i)
            fail_vtb.add(i)
real_vtb = sorted(list(real_vtb))
if not real_vtb:
    print(-1)
else:
    print("\n".join(real_vtb))