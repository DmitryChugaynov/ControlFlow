import java.util.Scanner;

public class Switch {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your int: ");
        int value = input.nextInt();

        /*if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }*/

        switch (value) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3 or 4 or 5");
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }
    }
}
