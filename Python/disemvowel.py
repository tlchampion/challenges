import re


def main():

    string = input("Enter string")
    print(disemvowel(string))


def disemvowel(string: str) -> str:
    return re.sub('[aeiouAEIOU]+', "", string)


if __name__ == "__main__":
    main()
