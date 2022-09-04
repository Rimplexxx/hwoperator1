public class Main {
    public static void main(String[] args) {

        //task1
        int age = 20;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }

        //task2
        int ageKid = 18;
        if (ageKid >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        if (ageKid < 7) {
            System.out.println("Ребенок еще не ходит в школу");
        }
        if (ageKid >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (ageKid >=24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        //task3
        int totalSeats = 102;
        int sittingSeats = 60;
        int standingSeats = totalSeats - sittingSeats;
        standingSeats = 42;

        if (totalSeats >= 102) {
            System.out.println("Мест в вагоне нет");
        }
        if (totalSeats < 102) {
            System.out.println("В вагоне есть места");
        }
        if (sittingSeats >= 60) {
            System.out.println("Сидячих мест в вагоне нет");
        }
        if (sittingSeats < 60) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (standingSeats >= 42) {
            System.out.println("Стоячих мест в вагоне нет");
        }
        if (standingSeats < 42) {
            System.out.println("В вагоне есть стоячие места");
        }

        //task4
        int age2 = 20;
        if (age2 >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }

        //task5
        int ageKid2 = 18;
        if (ageKid2 >= 7) {
            System.out.println("Ребенок ходит в школу");
        } else {
            System.out.println("Ребенок еще не ходит в школу");
        }
        if (ageKid2 >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else {
            System.out.println("Человек еще не закончил школу и не может отправляться в университет");
        }
        if (ageKid2 >=24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        } else {
            System.out.println("Человек еще не окончил университет и ему рано искать первую работу");
        }

        //task6
        int totalSeats2 = 102;
        int sittingSeats2 = 60;
        int standingSeats2 = totalSeats2 - sittingSeats2;
        standingSeats2 = 42;

        if (totalSeats2 >= 102) {
            System.out.println("Мест в вагоне нет");
        } else {
            System.out.println("В вагоне есть места");
        }
        if (sittingSeats2 >= 60) {
            System.out.println("Сидячих мест в вагоне нет");
        } else {
            System.out.println("В вагоне есть сидячие места");
        }
        if (standingSeats2 >= 42) {
            System.out.println("Стоячих мест в вагоне нет");
        } else {
            System.out.println("В вагоне есть стоячие места");
        }

        //task7
        int ageHuman = 20;
        if (ageHuman >= 2 && ageHuman <=6) {
            System.out.println("Если возраст человека равен " + ageHuman + " , то ему нужно ходить в детский сад");
        }
        if (ageHuman >= 7 && ageHuman <=18) {
            System.out.println("Если возраст человека равен " + ageHuman + " , то ему нужно ходить в школу");
        }
        if (ageHuman >= 18 && ageHuman <=24) {
            System.out.println("Если возраст человека равен " + ageHuman + " , то ему нужно ходить на работу");
        }
        if (ageHuman >= 24) {
            System.out.println("Если возраст человека равен " + ageHuman + " , то ему пора ходить на работу");
        }

        //task8
        int ageChildren = 4;
        if (ageChildren < 5) {
            System.out.println("Ребенок еще не может кататься на аттракционе");
        }
        if (ageChildren >= 5 && ageChildren < 14) {
            System.out.println("Ребенок может кататься на аттракционе только в сопровождении взрослого");
        }
        if (ageChildren >= 14) {
            System.out.println("Ребенок может кататься на аттракционе без сопровождения взрослого");
        }

        //task9
        int one = 16;
        int two = 79;
        int three = 55;
        if (one > two && one > three) {
            System.out.println("one больше two и three");
        }
        if (two > one && two > three) {
            System.out.println("two больше one и three");
        }
        if (three > one && three > two) {
            System.out.println("three больше one и two");
        }
    }
}