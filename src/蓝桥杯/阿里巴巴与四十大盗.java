package 蓝桥杯;
import java.util.Scanner;
import java.util.TreeSet;
public class 阿里巴巴与四十大盗 {
    public static void main(String[] args){
        TreeSet<Obj> set = new TreeSet<>();
        Scanner in = new Scanner(System.in );
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a, b;
            a = in.nextInt();
            b = in.nextInt();
            for (int j = 0; j < a; j++) {
                set.add( new Obj( in.nextDouble(), in.nextDouble() ) );
            }
            double sum=0.0;
            for (Obj obj:set) {
                if( b>obj.w ) {
                    b-=obj.w;
                    sum+=obj.v;
                }
                else{
                    sum+=b * obj.p;
                    break;
                }
            }
            if (sum - (int) sum == 0) {
                System.out.println( (int) sum );
            } else {
                System.out.printf("%.1f", sum );

            }
            set.clear();
        }
    }

    static class Obj implements Comparable{
        double w;
        double v;
        double p; //性价比
        public Obj(double w, double v) {
            this.w = w;
            this.v = v;
            this.p = v/w;
        }
        @Override
        public int compareTo(Object o) {
            return Double.compare( ((Obj)o).p,p );
        }
    }
}
