at,ah = map(int,input().split())
bt,bh = map(int,input().split())

a, b = ah // bt + (1 if ah%bt else 0), bh//at + (1 if bh%at else 0)

if a > b :
    print("PLAYER A")
elif a < b:
    print("PLAYER B")
else:
    print("DRAW")