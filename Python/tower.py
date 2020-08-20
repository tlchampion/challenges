

def buildTower(floors: int) -> list:
    total_spaces = (2 * floors) - 1
    print(total_spaces)
    solution = []
    for i in range(1,floors+1):
        str1 = ' ' * ((total_spaces - (2*i - 1)) // 2)
        str2 = "*" * (2*i - 1)
        floor = str1 + str2 + str1
        solution.append(floor)

    return solution

def buildTower2(floors: int) -> list:
    return [('*' * (2*i - 1)).center(2*floors - 1) for i in range(1,floors+1)]


def main():
    floors = int(input("Number of floors?"))
    solution = buildTower(floors)
    print(solution)
    solution2 = buildTower2(floors)
    print(solution2)


if __name__ == '__main__':
    main()
