hash = {
    "a": "aespa",
    "b": "baekjoon",
    "c": "cau",
    "d": "debug",
    "e": "edge",
    "f": "firefox",
    "g": "golang",
    "h": "haegang",
    "i": "iu",
    "j": "java",
    "k": "kotlin",
    "l": "lol",
    "m": "mips",
    "n": "null",
    "o": "os",
    "p": "python",
    "q": "query",
    "r": "roka",
    "s": "solvedac",
    "t": "tod",
    "u": "unix",
    "v": "virus",
    "w": "whale",
    "x": "xcode",
    "y": "yahoo",
    "z": "zebra"
}
inp = input()
linp = len(inp)
ans = []
idx = 0
flag = True
while idx < linp:
    chr = inp[idx]
    word = hash[chr]
    lchr = len(word)

    part = inp[idx:idx + lchr]

    if part != word:
        flag = False
        break
    ans.append(chr)
    idx += lchr
if flag:
    print('It\'s HG!')
    print(''.join(ans))
else:
    print('ERROR!')