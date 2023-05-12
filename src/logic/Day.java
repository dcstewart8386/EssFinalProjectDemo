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
    
    private int year;
    private int month;
    private int day;
    
    public Day(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public String getDateString() {
        return year+"/"+month+"/"+day;
    }
}
