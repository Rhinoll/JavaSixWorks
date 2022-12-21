package enums;

public class Year {
    public enum yearTime{
        Winter (-5, "Зима самое холодное время года."),
        Spring (10, "Весна - время расцвета всего живого после зимы."),
        Summer (25, "Лето самый теплый сезон в году."),
        Autumn (9, "Осень - дождливое и тоскливое время.");


        private final int temp;
        private final String description;

        yearTime(int temp, String description) {
            this.temp = temp;
            this.description = description;
        }
        public int getTemp(){
            return this.temp;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return description + " Температура = " + temp;
        }
    }


    public Year(yearTime Seasons){
        switch(Seasons){
            case Autumn -> System.out.println("Я люблю осень. Температура = " + Seasons.getTemp() + "°C");
            case Spring -> System.out.println("Я люблю весну. Температура = " + Seasons.getTemp() + "°C");
            case Winter -> System.out.println("Я люблю зиму. Температура = " + Seasons.getTemp() + "°C");
            case Summer -> System.out.println("Я люблю лето. Температура = " + Seasons.getTemp() + "°C");
        }
    }
    public String getDescription(yearTime Season){
        if (Season == yearTime.Winter)
            return "Холодное время года";
        if (Season == yearTime.Summer)
            return "Теплое время года";
        return null;
    }

    public static void main(String[] args) {
        yearTime my_favorite_time_of_year = yearTime.Winter;
        yearTime Season = yearTime.Autumn;
        Year year = new Year(Season);
        for (yearTime level : yearTime.values()) {
            System.out.println(level.toString());
        }
    }

}
