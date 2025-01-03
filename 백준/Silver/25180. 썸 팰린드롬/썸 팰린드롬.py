n = int(input())
if n < 10:
    print(1)
else:
    ans = (n-1) // 9 + 1
    if ans % 2 == 0 and n % 2 == 1:
        ans +=1
    print(ans)
