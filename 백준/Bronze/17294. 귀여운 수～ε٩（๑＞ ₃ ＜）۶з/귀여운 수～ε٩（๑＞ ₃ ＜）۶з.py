import sys

input = sys.stdin.readline

n = input().strip()
if int(n) < 100:
    print("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!")
else:
    flag = False
    bfr = int(n[0]) - int(n[1])
    for i in range(1,len(n) - 1):
        if bfr == int(n[i]) - int(n[i+1]):
            bfr = int(n[i]) - int(n[i+1])
        else:
            flag = True
            break
    if flag:
        print("흥칫뿡!! <(￣ ﹌ ￣)>")
    else:
        print("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!")