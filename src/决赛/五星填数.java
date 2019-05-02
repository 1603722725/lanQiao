package 决赛;
/**
 * @author 汪磊
 * @date 2019/4/3 - 20:23
 */
public class 五星填数 {
    public static int[] array = {1,2,3,4,5,6,8,9,10,12};
    public static int count = 0;
    public static void All_P(int n){
        if(n == 10){
            if(jud()){
                for(int i  = 0; i< 10; i++){
                    System.out.print(array[i]+" ");
                }
                System.out.println();
                count++;
            }
        }
        //全排列
        for(int i = n; i < 10; i++){
            int temp = array[i];
            array[i] = array[n];
            array[n] = temp;
            All_P(n+1);
            int tmep = array[i];
            array[i] = array[n];
            array[n] = tmep;
        }

    }
    private static boolean jud() {
        // TODO Auto-generated method stub
        int temp = array[0]+array[5]+array[6]+array[2];
        if(temp != array[2]+array[8]+array[7]+array[4])
            return false;
        if(temp != array[4]+array[5]+array[9]+array[1])
            return false;
        if(temp != array[1]+array[6]+array[7]+array[3])
            return false;
        if(temp != array[3]+array[8]+array[9]+array[0])
            return false;
        return true;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        All_P(0);
        System.out.println(count/10);
    }

}