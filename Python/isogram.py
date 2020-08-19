
def main():
    word = input("Please enter a word:")
    solution = isIsogram(word)
    print(solution)

def isIsogram(string):
    if len(string) == 0: return True
    string = string.lower()
    counts = {}
    for letter in string:
        if letter not in counts:
            counts[letter] = 1
        else:
            return False

    return True


# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    main()


