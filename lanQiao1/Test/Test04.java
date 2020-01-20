package Test;

public class Test04 {
	//给定一个NxN的矩阵matrix,在这个矩阵中，只有0和1两种值，返回边框全是1的最大正方形的变成长度
	// {0,1,1,1,1},
	// {0,1,0,0,1},
	// {0,1,0,0,1},
	// {0,1,1,1,1},
	// {0,1,0,1,1}   其中边框全是1的最大正方形的大小4*4 返回4
	    static int [][][]Helper;
		public static void main(String[] args){
			// TODO 自动生成的方法存根
	        int [][]A= {
	        		 {0,1,1,1,1},
	        		 {0,1,1,0,1},
	        		 {0,1,0,1,1},
	        		 {0,1,1,0,1},
	        		 {0,1,0,1,1}
	        };
	        generalHelpRec(A);
	        print(Helper);
	       int res= solve(A);
	       System.out.println(res);
		}
		private static void print(int[][][] helper) {
			// TODO 自动生成的方法存根
			for (int i = 0; i < helper.length; i++) {
				for (int j = 0; j < helper.length; j++) {
					  System.out.print(helper[i][j][0]+","+helper[i][j][1]+"\t");
				}
	            System.out.println();
			}
		}
		private static void generalHelpRec(int[][] A) {
			// TODO 自动生成的方法存根
			int N=A.length;
			Helper =new int [N][N][2]; //辅助空间Helper前两位表示矩阵下标，
			                           //第三位0放往右合并有多少个1的元素
			//对最后一行赋值初始化                              //第三位1表示往下合并多少个元素，统计最大正方形只要三个点合并
			                          //的值大于等于n 就可以了
			int row=N-1; //最后位下标
		   for (int i = N-1; i >=0; i--) {
			int value= A[N-1][i];
			if(value==1) {
				if (i==N-1) {//当前位置在最后面
					Helper[row][i][0]=1;
				}
				else {
					Helper[row][i][0]=Helper[row][i+1][0]+1;
				}
				Helper[row][i][1]=1;
			}
		}
		   row--;//最后一行处理完，行上去了一行
		         //之所以单独处理最后一行，因为往下吃1的呢部分最后一行是零，我们直接置1上去。
		         //然后处理上面几行的数据
		        for (int  i= row; i >=0; i--) {
					for (int j = N-1; j >=0; j--) {
						int value=A[i][j];
						if (value==1) {
							if (j==N-1) {
								Helper[i][j][0]=1;    
							}
							else {
								Helper[i][j][0]=Helper[i][j+1][0]+1;
							}
							Helper[i][j][1]=Helper[i+1][j][1]+1;
							}
						}
					}
				}
		private static int solve(int [][]A) {
		int N=A.length;
		int n=N;
		while (n>0) {
			for (int i = 0; i < N; i++) {
				if(i+n>N)break;  //当前点如果要构成n边长的正方形此时已经超过最长长度不做直接跳下个循环
				for (int j = 0; j < N; j++) {//两层循环遍历矩阵全部点
					if(j+n>N)break;
					if(check(i,j,n)) { //检查为真说明已经构建成功了直接返回边数
						return n;
					}
				}
			}
			 n--;
		}
		  
			return n;
		}
		private static boolean check(int i, int j, int n) {
			// TODO 自动生成的方法存根
			if (Helper[i][j][0]>=n&&Helper[i][j][1]>=n&&Helper[i+n-1][j][0]>=n&&Helper[i][j+n-1][1]>=n) {
				return true;
			}
			return false;
		}
	}


