

""" Determine if a user entered year is a leap year
"""

def isleap(year):
    """ Will return True if the year is a leap year or False if the year is not a leap year.
    A year will be classified as a leap year if:
     *it is evenly divisible by 4
        *except if it is evenly divisible by 100 it is not a leap year
            *except if it is evenly divisible by 400 it is a leap year
            """
    leap = False


    if((year % 4 == 0 and year % 100 != 0) or year % 400 == 0):
        leap = True
    return leap

def main():
    print(isleap.__doc__)
    year = int(input("Please enter the year: "))
    solution = isleap(year)
    print(solution)



if __name__ == '__main__':
    main()
