/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author dcstewart
 */
public class Day {

    // constants to represent skyIndex values
    public static final int CLEAR = 0;
    public static final int MIX = 1;
    public static final int CLOUD = 2;
    public static final int RAIN = 3;
    
    private int year;
    private int month;
    private int day;
    private int high = 0;
    private int low = 0;
    private int skyIndex = CLEAR;
    
    
    public Day(int year, int month, int day) {
        updateDate(year, month, day);
    }
    
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
    
    public String getDateString() {
        return year+"/"+month+"/"+day;
    }
}
