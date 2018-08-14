

public class Demo15{
    public static void main(String[] args){
        Person tom;
        tom = new Person(10);
        Person bob = new Person(1.8f);
        System.out.println(tom.age);
        System.out.println(bob.height);
        tom.speak();
    }
}