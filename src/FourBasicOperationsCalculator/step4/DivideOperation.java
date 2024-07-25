package FourBasicOperationsCalculator.step4;

public class DivideOperation extends AbstractOperation {

    @Override
    public double operate(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            System.out.println("0으로는 나눌 수 없습니다!");
            return 0;
        } else {
            return (double) firstNumber / secondNumber;
        }
    }
}
