

def main():
    string = input("Enter string:")

    print(split(string))

def split(s: str) -> list:
    if len(s) % 2 != 0: s += "_"

    return [s[i:i+2] for i in range(0, len(s), 2)]

if __name__ == '__main__':
    main()
