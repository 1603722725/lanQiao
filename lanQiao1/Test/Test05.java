package Test;
public class Test05 {
//编程返回子数组最大累加和
	public static void main(String[] args) {
		int a[]={1,-2,3,-1,5,-2,6,-1};
		System.out.println(findMax(a));
	}
	//递推法O(n)
	public static int findMax(int arr[]){
		int sum = arr[0];
		int max = sum;
		int left,right;
		for (int i = 1; i < arr.length; i++) {
			if(sum>0){
				sum+=arr[i];
			}else{
				sum = arr[i];
				left = i;//左下标
			}
			if(sum>max){
				max=sum;
				right=i;//右下标
			}
		}
		return max;
		
	}

}
