package seasons;

import java.util.Locale;

public enum Months {
        JANUARY(2, Seasons.WINTER),
        FEBRUARY(1, Seasons.WINTER),
        MARCH(6, Seasons.SPRING),
        APRIL(10, Seasons.SPRING),
        MAY(12, Seasons.SPRING),
        JUNE(15, Seasons.SUMMER),
        JULY(20, Seasons.SUMMER),
        AUGUST(21, Seasons.SUMMER),
        SEPTEMBER(15, Seasons.FALL),
        OCTOBER(16, Seasons.FALL),
        NOVEMBER(7, Seasons.FALL),
        DECEMBER(-3, Seasons.WINTER);

    private final int temperature;
    private final Seasons season;

    private enum Seasons {
        SPRING,
        SUMMER,
        FALL,
        WINTER
    };

    Months(int temperature, Seasons season) {
        this.temperature = temperature;
        this.season = season;
    }

    public static void print(String month) {
        try {
            System.out.printf(
                    "%s of %s has average temperature is %s",
                    month,
                    Months.valueOf(month.toUpperCase(Locale.ROOT)).season.toString().toLowerCase(Locale.ROOT),
                    Months.valueOf(month.toUpperCase(Locale.ROOT)).temperature);
        } catch (Exception e) {
            System.err.println("Wrong spelling.");
        }
    }

};


