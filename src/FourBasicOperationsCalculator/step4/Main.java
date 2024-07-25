package FourBasicOperationsCalculator.step4;

public class Main {
    public static void main(String[] args) {

        //덧셈 계산기
        Calculator addcal = new Calculator(new AddOperation());
        System.out.println(addcal.calculate(3,5));

        //뺄셈 계산기
        Calculator subcal = new Calculator(new SubstractOperation());
        System.out.println(subcal.calculate(5,3));

        //곱셈 계산기
        Calculator multcal = new Calculator(new MultiplyOperation());
        System.out.println(multcal.calculate(3,5));

        //나눗셈 계산기
        Calculator divcal = new Calculator(new DivideOperation());
        System.out.println(divcal.calculate(5,2));

    }
}
