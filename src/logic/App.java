package logic;

// This will be the root class for the logic component of our program
public class App {
    
    private final int MAX_DAYS = 100; // The number of days our app is capable of storing
    private int numDays = 0; // The current number of days being stored
    private Day[] days; 
    
    public App() {
        days = new Day[MAX_DAYS];
        populateTestData();
    }
    
    // Returns an array of strings representing all dates we currently
    // have stored
    public String[] getAllDateStrings() {
        String[] result = new String[numDays];
        for (int i = 0; i < numDays; i++) {
            result[i] = days[i].getDateString();
        }
        return result;
    }
    
    // Given an index in the `days` array, returns the associated `Day` object
    public Day getDay(int dayIndex) {
        return days[dayIndex];
    }
    
    // Adds a day to the array
    public void addDay(int year, int month, int day, int high, int low, int skyIndex) {
        days[numDays] = new Day();
        days[numDays].updateDate(year, month, day);
        days[numDays].updateForecast(high, low, skyIndex);
        numDays++;
    }
    
    // Removes a day from the array, given the index of the array we want
    // to delete from. Uses the deletion algorithm we looked at earlier in the course.
    public void deleteDay(int index) {
        for (int i = index; i < numDays; i++) {
            days[i] = days[i+1];
        }
        numDays--;
    }
    
    // This is used for testing our app. It creates some data so we don't
    // need to enter it in every time
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
