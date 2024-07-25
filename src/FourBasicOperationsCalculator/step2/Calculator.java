package FourBasicOperationsCalculator.step2;

public class Calculator {
    int firstNumber;
    int secondNumber;
    String opreator;

    //메서드
    public double calculate(String opreator, int firstNumber, int secondNumber) {
        switch (opreator) {
            case "+":
                return firstNumber + secondNumber;

            case "-":
                return firstNumber - secondNumber;

            case "X":
                return firstNumber * secondNumber;

            case "/":
                if (secondNumber == 0) {
                    System.out.println("0으로는 나눌 수 없습니다!");
                    return 0;
                } else {
                    return (double) firstNumber / secondNumber;
                }

            case "%":
                if (secondNumber == 0) {
                    System.out.println("0으로는 나눌 수 없습니다!");
                    return 0;
                } else {
                    return firstNumber % secondNumber;
                }

            default :
                System.out.println("연산자가 잘못되었습니다.");
                return 0;
        }
    }
}
