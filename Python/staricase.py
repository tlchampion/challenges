
def staircase(n: int):
   # return [('*' * i).rjust(n) for i in range(1, n + 1)]
   for j in [('*' * i).rjust(n) for i in range(1, n + 1)]: print(j)

def drawstairs(n: int):
   return "\n".join([('I').rjust(i) for i in range(1, n + 1)])



def main():
    n = int(input("How many levels?"))
    staircase(n)
    print(drawstairs(n))



if __name__ == '__main__':
    main()
