function timeConversion(s) {
    /*
     * Write your code here.
     */
    let timeFormat = s.match(/AM|PM/)[0];
    let time = s.split(/AM|PM/)[0];
    let hour = Number(time.substr(0,2));
    if (timeFormat === "PM") {
        hour = (hour === 12) ? "12" : hour + 12;        
        time = hour+time.substr(2);       
    } else {
        if (hour === 12) {
            time = `00${time.substr(2)}`;
        }
    }
    return time;
}
