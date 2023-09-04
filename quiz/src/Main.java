import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int age;
        String firstName;
        String favouriteFood;
        System.out.println("Please enter your age:");
        age = scanner.nextInt();
        System.out.println("Please enter your first name:");
        firstName = scanner.next();
        System.out.println("Please enter your favourtie food:");
        favouriteFood = scanner.next();
        String output = "First name: "+firstName+"\n"+"Age: "+age+"\n"+"Favourite food: "+favouriteFood;
        System.out.println(output);
    }
}