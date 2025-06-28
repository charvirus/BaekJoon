import sys

input = sys.stdin.readline

for i in range(int(input())):
    inp = input().strip().lower()
    chk = [0] * 26
    for j in inp:
        if 97<=ord(j)<=122:
            chk[ord(j) - 97] += 1

    if min(chk) == 0:
        print(f"Case {i + 1}: Not a pangram")
    elif min(chk) == 1:
        print(f"Case {i + 1}: Pangram!")
    elif min(chk) == 2:
        print(f"Case {i + 1}: Double pangram!!")
    elif min(chk) == 3:
        print(f"Case {i + 1}: Triple pangram!!!")