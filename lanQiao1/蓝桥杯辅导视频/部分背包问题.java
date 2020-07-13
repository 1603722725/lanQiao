package

���ű�������Ƶ;

import java.util.Arrays;
import java.util.zip.DeflaterOutputStream;

/**
 * @author wl
 * @Data 2020-05-06 21:38
 */
public class ���ֱ������� {
public static void main(String[]args){
        int[]w={1,2,3,4,5};
        int[]v={3,4,3,1,4};
        int n=w.length;
        Obj[]objs=new Obj[n];
        for(int i=0;i<n; i++){
        objs[i]=new Obj(w[i],v[i]);
        }
        Arrays.sort(objs);
        double c=10;
        double maxValue=0;
        for(int i=n-1;i>=0;i--){
        if(objs[i].w<=c){
        maxValue+=objs[i].v;
        c-=objs[i].w;
        }else{
        maxValue+=objs[i].v*(c/objs[i].w);
        break;
        }
        }
        System.out.println(maxValue);
        }
        }

class Obj implements Comparable<Obj> {
    int w;
    int v;

    public Obj(int w, int v) {
        this.w = w;
        this.v = v;
    }

    public double getPrice() {
        return (double) v / w;
    }

    @Override
    public int compareTo(Obj o) {
        if (this.getPrice() == o.getPrice())
            return 0;
        else if (this.getPrice() < o.getPrice())
            return -1;
        else
            return 1;
    }
}
