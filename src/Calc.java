public class Calc {

    public static int calculation(int firstNumber, int secondNumber, char operation){
        int result;
        switch (operation){
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            default:
                result = 0;
        }

        return result;
    }

}
