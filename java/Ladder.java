public class Ladder{
    double top;
    static double bottom;

    public void setTop(double top){
        this.top = top;
    }
    public double getTop(){
        return this.top;
    }

    public static double getBottom(){
        return bottom;
    }

    public static void setBottom(double bottom){
        Ladder.bottom = bottom;
    }

}