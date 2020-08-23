

def main():
    number = int(input("Please enter an integer"))

    print(solution(number))

def solution(number) -> int:
    multiples = set()


    for num in range(1,number):
        if num % 3 == 0 or num % 5 == 0:
            multiples.add(num)

    return sum(multiples)



if __name__ == '__main__':
    main()
