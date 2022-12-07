def isValid(s: str) -> bool:
    if len(s) % 2 != 0:
        return False

    stack = []
    for paren in s:
        if paren in ['{', '[', '(']:
            stack.append(paren)

        else:
            if len(stack) == 0:
                return False
            last = stack.pop()
            if (paren == '}' and last != '{') or (paren == ']' and last != '[') or (paren == ')' and last != '('):
                return False
    if len(stack) >= 1:
        return False
    return True


if __name__ == '__main__':

    theString = '){'
    print(isValid(theString))
