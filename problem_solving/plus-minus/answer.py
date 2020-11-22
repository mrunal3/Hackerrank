def plusMinus(arr):
    positive = list(filter(filterPositive, arr))
    negative = list(filter(filterNegative, arr))
    zero = list(filter(filterZero, arr))
    print(round(len(positive)/len(arr),6))
    print(round(len(negative)/len(arr),6))
    print(round(len(zero)/len(arr),6))
    
    
def filterPositive(x):
    return x > 0
    
def filterNegative(x):
    return x < 0
    
def filterZero(x):
    return x == 0
