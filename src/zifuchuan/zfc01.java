package zifuchuan;

public class zfc01 {
	public static void main(String[] args) {
		String str1 ="you are cool";
		System.out.println(reverse(str1));
	}
	
	public static String reverse(String str){
		String str1 = reverseString1(str);
		String[] words = str1.split("\\s");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			sb.append(reverseString1(words[i])+" ");
		}
		return sb.deleteCharAt(sb.length()-1).toString();
	}
	
	/*//字符压缩
	public static String zipString(String str){
		int count = 0;
		char last =0;
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if(sb.length()==0){
				sb.append(a);
				count++;
			}else{
				if(a==last){
					count++;
				}else{
					sb.append(count).append(a);
					count=1;
				}
			}
			last=a;
		}
		if(count>=1) sb.append(count);
		if(str.length()<sb.length()) return str;
		return sb.toString();
	}*/
	
	/*//判断两字符串中的各字符数是否相同
	public static boolean isEqual(String str1,String str2){
		int m = str1.length();
		int n = str2.length();
		if(m!=n) return false;
		int a[] = new int [200];boolean q=true;
		for (int i = 0; i < m; i++) {
			int x = (int)( str1.charAt(i));
			a[x]++;
		}
		for(int j=0;j<m;j++){
			int y=(int)( str2.charAt(j));
			a[y]--;
		}
		for(int k = 0;k<a.length;k++){
			if(a[k]!=0){
				 q= false;
				break;
			}
		}
		return q;
	}*/
	
	//字符串反转
	public static  String reverseString(String str){
		int len =str.length();
		char a[] = new char [len];
		for(int i=0;i<len;i++){
			a[i]=str.charAt(len-1-i);
		}
		return new String(a);
	}
	public static  String reverseString1(String str){
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();
	}
}
