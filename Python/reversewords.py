def main():
    s = input("Please enter sentence: ")
    print(reverse(s))

def reverse(text: str) -> str:

    str1 = " "
    return str1.join([word[::-1] for word in text.split(" ")])


if __name__ == '__main__':
    main()
