static String timeConversion(String s) {
    String timeFormat = s.substring(8);
    int hour = Integer.parseInt(s.substring(0,2));
    String time = s.substring(0,8);
    if (timeFormat.equals("PM")) {
        hour = (hour == 12) ? 12 : hour + 12;        
        time = Integer.toString(hour) + time.substring(2);       
    } else {
        if (hour == 12) {
            time = "00" + time.substring(2);
        }
    }
    return time;
}
