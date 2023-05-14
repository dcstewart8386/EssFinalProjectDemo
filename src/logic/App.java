/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author dcstewart
 */
public class App {
    
    private final int MAX_DAYS = 100;
    private int numDays = 0;
    private Day[] days;
    
    public App() {
        days = new Day[MAX_DAYS];
        populateTestData();
    }
    
    public String[] getAllDateStrings() {
        String[] result = new String[days.length];
        for (int i = 0; i < numDays; i++) {
            result[i] = days[i].getDateString();
        }
        return result;
    }
    
    public Day getDay(int dayIndex) {
        return days[dayIndex];
    }
    
    public void addDay(int year, int month, int day, int high, int low, int skyIndex) {
        days[numDays] = new Day();
        days[numDays].updateDate(year, month, day);
        days[numDays].updateForecast(high, low, skyIndex);
        numDays++;
    }
    
    private void populateTestData() {
        days[0] = new Day();
        days[0].updateDate(2023, 5, 12);
        days[0].updateForecast(24, 6, Day.CLOUD);
        days[1] = new Day();
        days[1].updateDate(2023, 5, 13);
        days[1].updateForecast(20, 8, Day.CLEAR);
        days[2] = new Day();
        days[2].updateDate(2023, 5, 14);
        days[2].updateForecast(18, 7, Day.RAIN);
        numDays = 3;
    }
}
