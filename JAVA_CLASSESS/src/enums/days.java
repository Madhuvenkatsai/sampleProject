package enums;

public enum days {

    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false),
    Test(true);



    private boolean isWeekday;

    // Constructor
    private days(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    // Getter method
    public boolean isWeekday() {
        return isWeekday;
    }

}
class class1{
    public static void main(String args[]){

        days day = days.MONDAY;
        System.out.println(day);
        /*for (days day : days.values()) {
            System.out.println(day + " is a " + (day.isWeekday() ? "weekday" : "weekend"));
           // System.out.println(day.isWeekday());
        }*/

    }
}
