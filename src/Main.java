public class Main {
    public static void main(String[] args) {
        //задание 4.1
        int age = 17;
        if (age >= 18)  { System.out.println("Поздравлям с совершеннолетием"); }
        if (age < 18) { System.out.println("Возраст совершеннолетия ещё не наступил,нужно немного подождать!"); }

        //Задание 4.2
        int humanAge = 10;
        if (humanAge >= 7 && humanAge <18)  {System.out.println("Ребенок ходит в школу");}
        if (humanAge >= 18 && humanAge < 24)  {System.out.println("Человек уже закончил школу и может отправляться в университет");}
        if (humanAge >= 24)  {System.out.println("Человек окончил университет и ему пора искать первую работу");}

        //Задание 4.3
        int passengerSeats = 74;
        if (passengerSeats <= 60) {System.out.println("Есть сидячие места");}
        if (passengerSeats > 60 && passengerSeats <= 102) {System.out.println("Есть сточие места");}
        if (passengerSeats > 102) {System.out.println("Мест нет, вагон полсностью забит");}

        //Задание 6.1
        int age1 = 17;
        if (age1 >= 18)  {System.out.println("Поздравлям с совершеннолетием");} else {
            System.out.println("Возраст совершеннолетия ещё не наступил,нужно немного подождать!"); }

        //Задание 6.2
        int humanAge1 = 25;
        if (humanAge1 >= 7 && humanAge1 <18)  {System.out.println("Ребенок ходит в школу");} else
        if (humanAge1 >= 18 && humanAge1 < 24)  {System.out.println("Человек уже закончил школу и может отправляться в университет");}
        else  {System.out.println("Человек окончил университет и ему пора искать первую работу");}

        //Задание 6.3
        int passengerSeats1 = 110;
        if (passengerSeats1 <= 60) {System.out.println("Есть сидячие места");} else
        if (passengerSeats1 > 60 && passengerSeats1 <= 102) {System.out.println("Есть сточие места");}
        else  {System.out.println("Мест нет, вагон полсностью забит");}

        //Задание 8.1
        int age2 = 2;
        boolean timeToNursery = age2 >= 2 && age2 <= 6;
        if (timeToNursery) {System.out.println("Если возраст человека равен " +age2+ ", то ему нужно ходить детский сад.");}
        boolean timeToSchool = age2 >= 7 && age2 <= 18;
        if (timeToSchool) {System.out.println("Если возраст человека равен " +age2+ ", то ему нужно ходить в школу.");}
        boolean timeToUniversity = age2 > 18 && age2 <= 24;
        if (timeToUniversity) {System.out.println("Если возраст человека равен " +age2+ ", то ему нужно ходить в университет.");}
        else if ( age2 > 24 ) {System.out.println("Если возраст человека равен " +age2+ ", то ему пора ходить на работу.");}

        //Задание 8.2
        int age3 = 1;
        boolean canNotRide = age3 <=5 && age3 > 0;
        if (canNotRide) {System.out.println("Если возраст ребенка равен " +age3+ ", то он не может кататься.");}
        boolean CanRideWithGrownup = age3 > 5 && age3 <= 14;
        if (CanRideWithGrownup) {System.out.println("Если возраст ребенка равен " +age3+ ", то он может кататься только со взрослыми.");}
        else if ( age3 > 14 ){System.out.println("Если возраст человека равен " +age3+ ", то он может кататься самостоятельно.");}

        //Задание 8.3
        int one = 1454;
        int two = 22164;
        int free = 6663;
        if (one > two && one > free) {System.out.println(one);}
            else if (two > one && two > free) {System.out.println(two);}
            else if (free > one && free > two) {System.out.println(free);}




    }
}