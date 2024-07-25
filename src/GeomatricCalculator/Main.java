package GeomatricCalculator;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        //원 넓이 계산
        System.out.println(cal.circlecal(30));
        //직사각형 넓이 계산
        System.out.println(cal.ractanglecal(20,40));
        //삼각형 넓이 계산
        System.out.println(cal.trianglecal(20,40));
    }
}
