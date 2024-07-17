for i in range(int(input())):
    B = int(input())
    inp = input()
    inp = inp.replace('O', '0').replace('I', '1')
    string = ''
    for j in range(B):
        beforeChg = inp[j * 8:j * 8 + 8]
        binary = int(beforeChg, 2)
        string += chr(binary)
    print(f"Case #{i + 1}: {string}")
