import sys

input = sys.stdin.readline
arr = {'ADD':'0000', 'SUB':'0001', 'MOV':'0010', 'AND':'0011', 'OR':'0100', 'NOT':'0101', 'MULT':'0110', 'LSFTL':'0111', 'LSFTR':'1000', 'ASFTR':'1001', 'RL':'1010', 'RR':'1011'}

for i in range(int(input())):
    inp = list(input().split())
    result = ""
    if inp[0][-1] == "C":
        result += arr[inp[0][0:-1]] + "10"
    else:
        result += arr[inp[0]] + "00"
    result += format(int(inp[1]), '03b')
    result += format(int(inp[2]), '03b')
    if inp[0][-1] == "C":
        result += format(int(inp[3]), '04b')
    else:
        result += format(int(inp[3]), '03b') + "0"
    print(result)
