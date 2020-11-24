def timeConversion(s):
    timeFormat = s[-2:]
    hour = int(s[:2])
    time = s[2:-2]
    if timeFormat == "PM": 
        hour = 12 if hour == 12 else hour + 12     
        time = str(hour) + time      
    else:
        if hour == 12:
            time = "00" + time
        else:
            time = s[:-2]
    return time
