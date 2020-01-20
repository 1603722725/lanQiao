package 天梯赛;

public class DP {
	//1. 最长公共子序列（LCS）：
	public static int LCS(String str1,String str2){
		int m=str1.length();
		int n=str2.length();
		int[][] dp=new int[m+1][n+1];
		//if(str1.charAt(i)==str2.charAt(j)) dp[i][j]==dp[i-1][j-1]+1;
		//else dp[i][j]=max(dp[i-1][j],dp[i][j-1])
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(str1.charAt(i-1)==str2.charAt(j-1)) 
					dp[i][j]=dp[i-1][j-1]+1;
				else
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
			}
		}
		return dp[m][n];
	}
	//2.最长公共子字符串（LCS）：
	public static int LCString(String str1,String str2){
		int m=str1.length();
		int n=str2.length();
		int longest=0;
		int[][] dp=new int[m+1][n+1];  // 表示长度为mn的两个子串的lcs
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(str1.charAt(i-1)==str2.charAt(j-1))
					dp[i][j]=dp[i-1][j-1]+1;
				else
					dp[i][j]=0;
				longest=Math.max(longest, dp[i][j]);
			}
		}
		return longest;
	}
	//3.最长递增子序列（LIS）：动态规划n2解法
	public static int LISDP(int[] a){
		int[] dp=new int[a.length+1];
		int res=0;
		for(int i=1;i<a.length+1;i++){
			int max=0;
			for(int j=1;j<i;j++){
				if(a[j-1]<=a[i-1]&&dp[j]>max)
					max=dp[j];
			}
			dp[i]=max+1;
			if(res<dp[i])
				res=dp[i];
		}
		return res;
	}
	//3.最长递增子序列（LIS）nlogn解法：
	
	//LIS有动态规划和LCS转LIS（排序+LCS）两种 n2方法，还有一个nlogn方法如下：
	//构造一个LIS（本身不是原本的LIS），保证最末位。
	static int len=0;
	public static int LIS(int[] arr){
		int[] lis=new int[arr.length];
		lis[0]=arr[0];  //目前LIS序列长度为1，末尾为arr[0]
		len=1;
		for(int i=1;i<arr.length;i++){
			if(arr[i]>=lis[len-1]){
				lis[len]=arr[i];
				len++;
			}
			else{		
				lis[binarysearch(lis, arr[i])]=arr[i];
			}
		}
		return len;
	}
	private static int binarysearch(int[] a,int key){
		int left=0;
		int right=len-1;
		int mid=(left+right)/2;
		while(left<right){
			mid=left+(right-left)/2;
			if(a[mid]<key)
				left=mid+1;
			else
				right=mid;
		}
		return left;//right is also ok
	}
	//4.编辑距离问题：
	public static int editdis(String str1,String str2){
		int m=str1.length();
		int n=str2.length();
		int[][] edit=new int[m+1][n+1]; // 防止低端越界以及特殊情况i
		for(int i=0;i<=m;i++)
			edit[i][0]=i;
		for(int i=0;i<=n;i++)
			edit[0][i]=i;
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){   // 把这里的j写成i是很常见的一个错误
				if(j>i) edit[i][j]=edit[i][i]+j-i;
				else if(j<i) edit[i][j]=edit[j][j]+i-j;
				else {
					if(str1.charAt(i-1)==str2.charAt(j-1))
						edit[i][j]=edit[i-1][j-1];
					else
						edit[i][j]=edit[i-1][j-1]+1;
				}
			}
		}
		return edit[m][n];
	}
	//5.判断是否为子序列
	public static boolean isSubSeq(String str1,String str2){
		int pointer1=0;
		int pointer2=0;
		while(pointer1<str1.length()&&pointer2<str2.length()){
			if(str1.charAt(pointer1)==str2.charAt(pointer2))
				pointer2++;
			if(pointer2==str2.length()) return true;
			pointer1++;
		}
		return false;
	}
	public static void main(String[] args){
		//测试程序：判断是否为子串！
		System.out.println("abcsdf".contains("abcd"));
		//测试程序：判断是否为子序列！
		System.out.println(isSubSeq("abscdljjkjkefg", "abcdefg"));
		//测试程序：输出最长公共子序列的长度
		System.out.println(LCS("abscljjkjkefg", "abcdefg"));
		//测试程序：输出最长递增子序列LIS nlogn
		int[] a={1,4,6,2,3,5,7};
		System.out.println(LIS(a));
		//测试程序：输出最长递增子序列LISDP n2
		System.out.println(LISDP(a));
		//测试程序：输出最长公共子字符串长度
		System.out.println(LCString("abscljjkjkdefg", "abcdefg"));  //3
		//测试程序：编辑距离
		System.out.println(editdis("kitten", "sitting"));  //3
		
		//int[] b={1,2,6};
		//System.out.println(binarysearch(b,3));
	}
}
