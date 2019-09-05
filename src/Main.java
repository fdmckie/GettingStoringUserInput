import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

//        String "P Sherman 42 Wallaby Way Sydney"

//        String firstInitial, lastName , houseNumber ,streetName ,streetType ,city;

        String firstInitial = input.next();
        String lastName = input.next();
        String houseNumber = input.next();
        String streetName = input.next();
        String streetType = input.next();
        String city = input.next();
        input.nextLine();


        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);



    }
}
