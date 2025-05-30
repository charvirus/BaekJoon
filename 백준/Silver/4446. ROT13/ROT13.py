vowels = ['a', 'i', 'y', 'e', 'o', 'u']
consonants = ['b', 'k', 'x', 'z', 'n', 'h', 'd', 'c', 'w', 'g', 'p', 'v', 'j', 'q', 't', 's', 'r', 'l', 'm', 'f']
ans = []
while True:
    try:
        n = input()
        ans = ""
        for i in n:
            islower = True
            if i.isupper():
                islower = False
                i = i.lower()
            if i in vowels:
                ch = vowels[(vowels.index(i) + 3) % 6]
                ans += ch if islower else ch.upper()
            elif i in consonants:
                ch = consonants[(consonants.index(i) + 10) % 20]
                ans += ch if islower else ch.upper()
            else:
                ans += i
        print(ans)
    except:
        break
