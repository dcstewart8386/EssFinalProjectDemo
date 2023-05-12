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
    
    private Day[] days;
    
    public App() {
        days = new Day[100];
        populateTestData();
    }
    
    private void populateTestData() {
        days[0] = new Day(2023, 5, 12);
        days[1] = new Day(2023, 5, 13);
        days[2] = new Day(2023, 5, 14);
    }
}
