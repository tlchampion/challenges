import bisect


class TwoSum:

    def __init__(self):
        self.values = []

    def add(self, number: int) -> None:
        bisect.insort(self.values, number)
        return None

    def find(self, value: int) -> bool:
        beg = 0
        end = len(self.values) - 1
        while end > beg:
            if self.values[beg] + self.values[end] == value:
                return True
            elif self.values[beg] + self.values[end] < value:
                beg += 1
            elif self.values[beg] + self.values[end] > value:
                end -= 1
        return False

        # Your TwoSum object will be instantiated and called as such:
        # obj = TwoSum()
        # obj.add(number)
        # param_2 = obj.find(value)


result = []
obj = TwoSum()
add1 = obj.add(1)
add2 = obj.add(5)
add3 = obj.add(3)
result.append(add1)
result.append(add2)
result.append(add3)
print(obj.values)
print(result)
find1 = obj.find(4)
find2 = obj.find(7)
result.append(find1)
result.append(find2)
print(result)
