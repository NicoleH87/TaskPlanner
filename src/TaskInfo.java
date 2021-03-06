import java.util.Arrays;

public class TaskInfo {
    private String[] months = new String[12];
    private String task;
    private String notes;
    private int month;
    private int day;
    private int year;
    private boolean priority;
    private boolean simple;
    private String type; // Maybe change this into a number given an arraylist of options

    public TaskInfo(String task, String notes, int month, int day, int year, boolean priority, boolean simple, String type) {
        this.task = task;
        this.notes = notes;
        this.month = month;
        this.day = day;
        this.year = year;
        this.priority = priority;
        this.simple = simple;
        this.type = type;
    }

    public String monthNumConversion (int num) {
        return months[num - 1];
    }

    public int monthStringConversion (String mon){
        int find = -1;
        for (int i = 0; i < months.length; i++) {
            if (months[i].equals("mon")) {
                find = i + 1;
            }
        }
        return find;
    }

    public String getTask () {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getNotes() {
        return notes;
    }

    public void setNote (String notes) {
        this.notes = notes;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean choice) { priority = choice; }

    public boolean isSimple() {
        return simple;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void print() {
        System.out.println("Type: " + type + "\nTask: " + task + "\nNotes: " + notes + "\nDate: " + month + "/" + day + "/" + year + "\nPriority: " + priority + "\nSimple: " + simple);
    }

}
