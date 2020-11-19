def compareTriplets(a, b):
    aScore = 0
    bScore = 0
    for i in range(len(a)):
        if a[i] > b[i]:
            aScore += 1
        elif a[i] < b[i]:
            bScore += 1
    return [aScore,bScore]
