word = [0 for i in range(26)]
while True:
    try:
        inStr = str(input()).replace(" ","")
        for s in inStr:
            word[ord(s)-97] += 1
    except EOFError:
        break
for i in range(26):
    if word[i] == max(word):
        print(chr(i + 97), end='')