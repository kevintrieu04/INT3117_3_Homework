// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class EventDeal {
    double totalPrice = -1;
    String extraReward = "none";
}

class Main {
    private static EventDeal calculatePrice(int age, int level) {
        EventDeal eventDeal = new EventDeal();

        if (age >= 0 && age <= 12) {
            eventDeal.totalPrice = 50000;
        } else if (age >= 13 && age <= 22) {
            eventDeal.totalPrice = 65000;
        } else if (age >= 23 && age <= 59) {
            eventDeal.totalPrice = 75000;
        } else if (age >= 60 && age <= 100) {
            eventDeal.totalPrice = 55000;
        } else {
            return eventDeal;
        }

        if (level >= 1 && level <= 2) {
            eventDeal.extraReward = "drink";
        }  else if (level >= 3 && level <= 5) {
            eventDeal.extraReward = "popcorn";
        } else if (level >= 6 || level < 0) {
            eventDeal.totalPrice = -1;
        }

        return eventDeal;
    }
    public static void main(String[] args) {
        EventDeal eventDeal = calculatePrice(1, 2);
        System.out.println(eventDeal.totalPrice);
        System.out.println(eventDeal.extraReward);
    }
}