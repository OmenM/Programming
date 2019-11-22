public enum Month {
    JANUARY("January", 1),
    FEBRUARY("February", 2),
    MARCH("March", 3),
    APRIL("April", 4),
    MAY("May", 5),
    JUNE("June", 6),
    JULY("July",7),
    AUGUST("August",8),
    SEPTEMBER("September", 9),
    OCTOBER("October", 10),
    NOVEMBER("November", 11),
    DECEMBER("December", 12);

    private String name;
    private final int monthNumber;

    Month(String name, int monthNumber) {
        this.name = name;
        this.monthNumber = monthNumber;
    }

    private final int MonthsPerYear = 12;




}
