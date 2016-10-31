package AccessModifier;

/**
 * Created by neelabhsingh on 31/10/16.
 */
public class InnerClassMember {
    public static class Line{
        private double k;
        private double b;
        private boolean isVertical;
        public Line(double k, double b, boolean isVertical){
            this.k =k;
            this.b = b;
            this.isVertical = isVertical;
        }

        @Override
        public String toString() {
            return this.k +"_"+this.b+"_"+this.isVertical;
        }
    }
    public static void main(String [] args){
        Line l = new Line(12.34, 45.34, false);
        print(l);
    }
    public static void print(Line l){
        System.out.println(l.k);
    }
}
