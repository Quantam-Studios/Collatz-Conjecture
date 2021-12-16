def collatz(numb):
  max = 0
  x = 0
  x = numb
  steps = 0
  while x != 1:
    steps += 1
    if (x % 2) == 0:
      x /= 2
    else:
      x*=3
      x += 1
    if x > max:
      max = x
  print(str(numb) + " returns: " + str(x) + " in " + str(steps) + " steps the highest number reached was " + str(max))

while True:
  number = input('Type any integer: ')
  collatz(int(number))