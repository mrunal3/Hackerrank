function countApplesAndOranges(s, t, a, b, apples, oranges) {
    let appleData = 0, orangeData = 0;
    let home_range = [s, t];
    apples.forEach((apple)=>{
        if (isInRange(a,home_range,apple)) {
            appleData += 1;
        }
    });
    oranges.forEach((orange)=>{
        if (isInRange(b,home_range,orange)) {
            orangeData += 1;
        }
    });
    console.log(appleData);
    console.log(orangeData);
}

function isInRange(tree_location, home_range, fruit_location) {
    let bool = false;
    let location = tree_location + fruit_location;
    bool = (home_range[0] <= location && location <= home_range[1]);
    return bool;
}
