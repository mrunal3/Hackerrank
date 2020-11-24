def countApplesAndOranges(s, t, a, b, apples, oranges):
    appleData , orangeData = 0, 0
    for apple in apples:
        if checkFruitRange(apple, a, [s, t]):
            appleData += 1
    for orange in oranges:
        if checkFruitRange(orange, b, [s, t]):
            orangeData += 1
    print(appleData)
    print(orangeData)

def checkFruitRange(fruit_location,tree_location,home_range):
    confirm = False
    location = tree_location + fruit_location;
    confirm = (home_range[0] <= location and location <= home_range[1])
    return confirm
