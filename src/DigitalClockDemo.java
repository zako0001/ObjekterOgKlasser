public class DigitalClockDemo {
    public static void main(String[] args) {

        ClockDisplay ur = new ClockDisplay();

        for (int i = 0; i < 1510; i++) {

            switch(i) {
                case 0:
                    System.out.println("Starttid:            " + ur.getDisplayValue());
                    break;
                case 1:
                    System.out.println("Efter 1 minut:       " + ur.getDisplayValue());
                    break;
                case 59:
                    System.out.println("Efter 59 minutter:   " + ur.getDisplayValue());
                    break;
                case 60:
                    System.out.println("Efter 60 minutter:   " + ur.getDisplayValue());
                    break;
                case 61:
                    System.out.println("Efter 61 minutter:   " + ur.getDisplayValue());
                    break;
                case 1439:
                    System.out.println("Efter 1439 minutter: " + ur.getDisplayValue());
                    break;
                case 1440:
                    System.out.println("Efter 1440 minutter: " + ur.getDisplayValue());
                    break;
                case 1441:
                    System.out.println("Efter 1441 minutter: " + ur.getDisplayValue());
                    break;
                case 1499:
                    System.out.println("Efter 1499 minutter: " + ur.getDisplayValue());
                    break;
                case 1500:
                    System.out.println("Efter 1500 minutter: " + ur.getDisplayValue());
                    break;
                case 1501:
                    System.out.println("Efter 1501 minutter: " + ur.getDisplayValue());
                    break;
            }

            ur.timeTick();
        }
    }
}
