idx = 0
for i in range(3, 0, -1):
    inp = input()
    if inp not in ['Fizz', 'Buzz', 'FizzBuzz']:
        idx = int(inp) + i

if idx % 3 == 0 and idx % 5 == 0:
    print('FizzBuzz')
elif idx % 3 == 0:
    print('Fizz')
elif idx % 5 == 0:
    print('Buzz')
else:
    print(idx)
