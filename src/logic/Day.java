package logic;

// This class represents the weather data associated for a particular date
public class Day {

    // constants to represent skyIndex values
    public static final int CLEAR = 0;
    public static final int MIX = 1;
    public static final int CLOUD = 2;
    public static final int RAIN = 3;
    
    // The properties of this class are given some default values
    private int year = 2000;
    private int month = 1;
    private int day = 1;
    private int high = 0;
    private int low = 0;
    private int skyIndex = CLEAR;
    
        
    public void updateDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public void updateForecast(int high, int low, int skyIndex) {
        this.high = high;
        this.low = low;
        this.skyIndex = skyIndex;
    }
    
    public int getYear() {
        return year;
    }
    
    public int getMonth() {
        return month;
    }
    
    public int getDay() {
        return day;
    }
    
    public int getHigh() {
        return high;
    }
    
    public int getLow() {
        return low;
    }
    
    public int getSkyIndex() {
        return skyIndex;
    }
    
    // Returns the full date in Y/M/D format
    public String getDateString() {
        return year+"/"+month+"/"+day;
    }
    
    // Returns the image filename to be used for this day, based on the value
    // of the skyIndex property
    public String getImageName() {
        if (skyIndex == CLEAR) return "clear.png";
        if (skyIndex == CLOUD) return "cloud.png";
        if (skyIndex == MIX) return "mix.png";
        if (skyIndex == RAIN) return "rain.png";
        return "";
    }
}
