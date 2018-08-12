public class Person{
    int age;
    float height;
    double weight = 160;

    Person(int age){
        this.age = age;
    }

    Person(float height){
        this.height = height;
    }

    void speak(){
        System.out.println("Hi~");
    }

    void eat(){
        System.out.println("eat");
    }

    void sleep(){
        System.out.println("sleep");
    }


    int eatCount(){
        return 2;
    }

    int eatCount2(int num){
        int result = num - 2;
        return result;
    }

    int getAge(int age){
        return this.age;
    }

}