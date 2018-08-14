public class Demo18{
    public static void main(String[] args){
        Circle circle = new Circle();
        circle.setRadius(12.5);

        Ladder ladder = new Ladder(10, 20, 15);

        People people = new People();

        System.out.println(people.computerArea(circle));
        System.out.println(people.computerArea(ladder));
    }
}