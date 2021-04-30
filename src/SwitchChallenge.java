public class SwitchChallenge {

    public static void main(String[] args) {

        char myChar = 'B';

        switch (myChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(myChar + " was found");
                break;
            default:
                System.out.println("Letter was not found");
                break;
        }
    }
}
