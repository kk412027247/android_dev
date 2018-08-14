public class Demo17{
    public static void main(String[] arg){
        Ladder.bottom = 100;
        Ladder ladder1 = new Ladder();
        Ladder ladder2 = new Ladder();

        ladder1.setTop(50);
        ladder2.setTop(60);

        ladder2.setBottom(10);

        System.out.println(ladder1.getTop());
        System.out.println(ladder2.getTop());
        System.out.println(ladder1.getBottom());
        System.out.println(ladder2.getBottom());

        System.out.println(Sum.getSum(1,10));
    }
}

class Sum{
    static int getSum(int start, int end){
        int sum = 0;
        for(int i=start; i<end; i++){
            sum += i;
        }
        return sum;
    }
}