package basics;

enum Day {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3);
    
    public int number;
    Day(int num) {
        number = num;
    }
}


class Enums {
    public static void main(String[] args) {
        Day day = Day.TUESDAY;
        System.out.println(day.number);
    }
}