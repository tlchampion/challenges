
def delete_nth(order, max_e):
    counts = {}
    solution = []
    for item in order:
        if item not in counts:
            counts[item] = 1
            solution.append(item)
        else:
            if counts[item] < max_e:
                counts[item] += 1
                solution.append(item)

    return solution




lst = [1,1,3,3,7,2,2,2,2]
N = 3
print(delete_nth(lst, N))

