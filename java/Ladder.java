public class Ladder{
    double top, bottom, height;
    Ladder(double a, double b, double h){
        top = a ;
        bottom = b;
        height = h;
    }

    double getArea (){
        return (top + bottom) * height / 2;
    }

//    static double bottom;

//    public void setTop(double top){
//        this.top = top;
//    }
//    public double getTop(){
//        return this.top;
//    }
//
//    public static double getBottom(){
//        return bottom;
//    }
//
//    public static void setBottom(double bottom){
//        Ladder.bottom = bottom;
//    }

}