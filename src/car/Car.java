package car;

public class Car {
    //1. 클래스 선언 V
    //2. 필드 선언 V
    //3. 생성자 선언
    //4. 메서드 선언

    private String constructor;
    private String model;
    private int year;
    private String color;
    private int speed;

    //초기값을 설정해주기
    public Car() {
        this.constructor = "Genessis";
        this.model = "GV80";
        this.year = 2023;
        this.color = "Black";
        this.speed = 0;
    }

    //매개변수를 사용했을 때의 설정
    public Car(String constructor, String model, int year, String color, int speed) {
        this.constructor = constructor;
        this.model = model;
        this.year = year;
        this.color = color;
        this.speed = 0;
    }

    //설정자 메서드
    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //접근자 메서드

    public String getConstructor() {
        return constructor;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getspeed() {
        return speed;
    }

    //메서드

    public void start() {
        System.out.println("자동차가 시동을 겁니다.");
    }

    public void gasPedal(int speed) {
        this.speed = speed;
        System.out.println(speed + "km/h까지 가속합니다.");
    }

    public void brakePedal(int speed) {
        this.speed = speed;
        System.out.println(speed + "km/h까지 감속합니다.");
    }

    public void carInfo() {
        System.out.println("차량 정보는 다음과 같습니다.");
        System.out.println("제조사 : " + constructor);
        System.out.println("차종 : " + model);
        System.out.println("연식 : " + year);
        System.out.println("색상 : " + color);
    }





}
