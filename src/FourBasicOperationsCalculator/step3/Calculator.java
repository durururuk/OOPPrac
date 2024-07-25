package FourBasicOperationsCalculator.step3;

public class Calculator {
    private AddOperation addOperation;
    private SubstractOperation substractOperation;
    private MultiplyOperation multiplyOperation;
    private DivideOperation divideOperation;
    String opreator;

    public Calculator() {
        this.addOperation = new AddOperation();
        this.substractOperation = new SubstractOperation();
        this.multiplyOperation = new MultiplyOperation();
        this.divideOperation = new DivideOperation();
    }

    public double calculate (String opreator, int firstNumber, int secondNumber) {
        switch(opreator){
            case "+":
                return addOperation.operate(firstNumber,secondNumber);
            case "-":
                return substractOperation.operate(firstNumber, secondNumber);
            case "/":
                return divideOperation.operate(firstNumber,secondNumber);
            case "X":
                return multiplyOperation.operate(firstNumber, secondNumber);
            default:
                System.out.println("연산자가 올바르지 않습니다.");
                return 0;
        }
    }
}
