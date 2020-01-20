package 蓝桥杯;




/*7-2	Have Fun with Numbers
 * public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str  = sc.nextLine();
		BigInteger big = new BigInteger(str);
		big=big.multiply(new BigInteger("2"));
		String str1 = big.toString();
		char a[]=str.toCharArray();
		char b[]=str1.toCharArray();
		int c[] = new int[10];
		int d[] = new int[10];
		for(int i=0;i<a.length;i++){
			c[a[i]-'0']++;
		}
		for(int i=0;i<b.length;i++){
			d[b[i]-'0']++;
		}
		boolean flag=true;
		for (int i = 0; i <10; i++) {
			if(c[i]!=d[i]){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("Yes");
			System.out.println(str1);
		}else{
			System.out.println("No");
			System.out.println(str1);
		}
		
	}
 * L1-016 查验身份证
 * 	    Scanner sc=new Scanner(System.in);
	    ArrayList<String> alist=new ArrayList<String>();
	    char[]x={'1','0','X','9','8','7','6','5','4','3','2'};
	    int []qz={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
	    int n=sc.nextInt();
	    String[] str=new String[n];
	    char[][]c=new char[n][18];
	    for(int i=0;i<n;i++){
	      str[i]=sc.next();
	      c[i]=str[i].toCharArray();
	      int sum=0;
	      for(int j=0;j<17;j++){
	        try{
	        sum+=Integer.parseInt((c[i][j])+"")*qz[j];
	        }catch(Exception e){
	          sum=-1;
	          break;
	        }
	      }
	      if(sum==-1){
	        alist.add(str[i]);
	      }else{
	        sum%=11;
	        if(!(x[sum]+"").equals((c[i][17])+"")){
	          alist.add(str[i]);
	        }
	      }
	    }
	    if(alist.isEmpty()){
	      System.out.print("All passed");
	    }else{
	      for(String ss:alist){
	        System.out.println(ss);
	      }
	    }
 * L1-017 到底有多二
 *   public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str = sc.nextLine();
	    double a=1,b=1;
	    double count =0;
	    double len =str.length();
	    if(str.charAt(0)=='-'){ a= 1.5; len--;}
	    if(((Integer.parseInt(str.charAt(str.length()-1)+""))&1)==0)  b=2;
	    
	    for (int i = 0; i < len; i++) {
			if(str.charAt(i)=='2')
				count++;
		}
	    double result =count/len*a*b;
	    result*=100;
	    DecimalFormat df = new DecimalFormat(".000");
	    System.out.println(df.format(result)+"%");

	    //System.out.println(String.format("%.2f", result)+"%");
	  }
 * 
 * 
 * 
 * */
 