package Demo;

/**
 * @author wl
 * @Data 2020-07-20 23:08
 */
public class Test02 {
    public static void main(String[] args) {

    }
    public int minArray(int[] numbers) {
        int ans = 0;
        if (numbers.length == 1) return numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i+1]){
                ans = numbers[i+1];
                break;
            }else {
                ans = numbers[0];
            }
        }
        return ans;
    }
}
