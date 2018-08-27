public class Demo11{
    public static void main(String args[]){
//        WeekDay w = WeekDay.Sunday;
//        if(w == WeekDay.Sunday){
//            System.out.println(w);
//        }

//        for(WeekDay x:WeekDay.values()){
//            System.out.println(x);
//        }

        WeekDay w = WeekDay.Monday;

        switch(w){
            case Monday:
                System.out.println(w);
                break;
            case Sunday:
                System.out.println(w);
                break;

        }

    }


    public enum WeekDay{
        Monday, Sunday
    }

}