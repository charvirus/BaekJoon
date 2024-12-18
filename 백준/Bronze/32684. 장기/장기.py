b, c, d, e, f, g = map(int, input().split())
bb, cc, dd, ee, ff, gg = map(int, input().split())

cho = b * 13 + c * 7 + d * 5 + e * 3 + f * 3 + g * 2
han = bb * 13 + cc * 7 + dd * 5 + ee * 3 + ff * 3 + gg * 2 + 1.5

if cho < han:
    print("ekwoo")
else:
    print("cocjr0208")
