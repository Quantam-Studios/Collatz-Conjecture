# specific number check 'c'
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

# all numbers check 't'
def collatzInfinite(startInt):
  testingVal = startInt
  while True:
    x = testingVal
    steps = 0
    while x != 1:
      steps += 1
      if (x % 2) == 0:
        x /= 2
      else:
        x*=3
        x += 1
    print("Number: " + str(testingVal) + " Steps: " + str(steps))
    testingVal += 1
      



while True:
  request = input("type 't' to see if the collatz conjecture is ever false for as long as you are willing to wait. \nOr type 'c' to check if a specific number supports the collatz conjecture.\n")
  if request == 'c':
    number = input('Type any integer: ')
    collatz(int(number))
  elif request == 't':
    number = input("Type the integer to start the check on: ")
    collatzInfinite(int(number))