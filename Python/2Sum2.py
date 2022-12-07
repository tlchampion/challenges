from typing import List


def twoSum(numbers: List[int], target: int) -> List[int]:
    beg = 0
    end = len(numbers) - 1
    while end > beg:
        if numbers[beg] + numbers[end] == target:
            return [beg+1, end+1]
        elif numbers[beg] + numbers[end] < target:
            beg += 1
        elif numbers[beg] + numbers[end] > target:
            end -= 1


if __name__ == '__main__':
    result = twoSum([2, 7, 11, 15], 9)
    print(result)
