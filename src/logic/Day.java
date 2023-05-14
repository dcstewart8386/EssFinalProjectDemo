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
    private final int CLEAR = 0;
    private final int MIX = 1;
    private final int CLOUD = 2;
    private final int RAIN = 3;
    
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
    
    public String getDateString() {
        return year+"/"+month+"/"+day;
    }
}
