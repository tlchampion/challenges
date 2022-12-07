from typing import List


def twoSum(nums: List[int], target: int) -> List[int]:
    unique_entries = set(nums)
    indices = {value: [i for i, v in enumerate(nums) if v == value]
               for value in unique_entries}
    print(indices)

    for i in nums:
        need = target - i
        if need in indices:
            if len(indices[need]) == 2:
                return indices[need]
            else:
                if indices[need] == indices[i]:
                    pass
                else:
                    result = [indices[need][0], indices[i][0]]
                    return result


if __name__ == '__main__':
    result = twoSum(nums=[3, 2, 4], target=6)
    print(result)
