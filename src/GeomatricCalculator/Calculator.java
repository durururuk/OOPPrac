package GeomatricCalculator;

public class Calculator {
    private Circle circle;
    private Ractangle ractangle;
    private Triangle triangle;

    //초기 생성자
    public Calculator() {
        this.circle = new Circle();
        this.ractangle = new Ractangle();
        this.triangle = new Triangle();
    }

    public double circlecal(int radius) {
        return circle.calculate(radius);
    }

    public double ractanglecal(int width, int height) {
        return ractangle.calculate(width, height);
    }

    public double trianglecal(int width, int height) {
        return triangle.calculate(width, height);
    }



}
