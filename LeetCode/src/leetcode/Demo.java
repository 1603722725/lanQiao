package leetcode;

import com.sun.javafx.image.BytePixelSetter;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.org.apache.regexp.internal.RE;
import com.sun.xml.internal.ws.util.exception.LocatableWebServiceException;

import javax.swing.*;
import javax.swing.event.ListDataEvent;
import javax.xml.transform.sax.SAXTransformerFactory;
import java.lang.annotation.ElementType;
import java.util.*;
import java.util.concurrent.ForkJoinPool;

/**
 * @author wl
 * @Data 2020-02-14 15:04
 * LeetCode ×Ö·û´®×¨Ìâ
 */
public class Demo {
    public static void main(String[] args) {
        int[][] nums1 ={ { 1, 2, 3 } ,
                        {4, 5, 6},
                        {7, 8, 9}};
////        int[] nums2  ={1,2,6,9,70};
////        double result = findMedianSortedArrays(nums1,nums2);
//        int c=1;
//        int[] arr = findDiagonalOrder(nums1);
//        List list = spiralOrder(nums1);
//        System.out.println(list);
//        List<List<Integer>> list = generate(5);
//        String str = addBinary("11","1");
//        int res = strStr("a","a");
//        System.out.println(res);
//        String[] str = {"flower","flow","flight","fl"};
//        String s1 = longestCommonPrefix(str);
//        int[] arr = {1,2,3,4,5};
//        int res = minSubArrayLen(11,arr);
//        rotate(arr,2);
//        String str = "wang lei hello";
//        String s = reverseWords1(str);
        HashMap hashMap = new HashMap();
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int pivotIndex(int[] nums) {
        if (nums.length==1)
            return -1;
        int index=1;
        boolean flag = true;
        while (flag && index<nums.length-1){
            int sumLeft=0,sumRight=0;
            for (int i = 0; i <index ; i++) {
                sumLeft+=nums[i];
            }
            for (int i = nums.length-1; i >index; i--) {
                sumRight+=nums[i];
            }
            if (sumLeft==sumRight){
                flag = false;
                return index;
            }else {
                index++;
            }
        }
        return -1;
    }
    public static int dominantIndex(int[] nums) {
        if (nums.length==1)
            return 0;
        int index=0;
        int max =nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max<nums[i]){
                max=nums[i];
                index = i;
            }
        }
        int mmax=nums[index];
        Arrays.sort(nums);
        if (mmax>=nums[nums.length-2]*2)
            return index;
        return -1;
    }
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        int[] arr = new int[len+1];
        int index = -1;
        if (digits[len-1]!=9){
            digits[len-1] = digits[len-1]+1;
        }else {
            len--;
            while(digits[len]==9){
                index = len;
                len--;
                if (len==-1) break;
            }
            if (index==0){
                arr[0]=1;
                for (int i = 1; i < arr.length; i++) {
                    arr[i] = 0;
                }
                return arr;
            }else {
                digits[index-1]+=1;
                for (int i = index; i <digits.length ; i++) {
                    digits[i]=0;
                }
                return digits;
            }
        }
        return digits;
    }
    public static int[] findDiagonalOrder(int[][] matrix) {
        int[] arr = new int[0];
        if (matrix.length==0)
            return arr;
        int r=0,m=matrix.length;
        int c=0,n=matrix[0].length;
        int count = 0;
        arr = new int[m*n];
        boolean flag = true;
        while (r<m && c<n){
            if (flag){
                arr[count++]=matrix[r][c];
//                System.out.print(matrix[r][c]+" ");
                if (r==0 && c<n-1){
                    flag = !flag;
                    c++;
                }else if(r>=0 && c==n-1){
                    flag =  !flag;
                    r++;
                }else{
                    r--;
                    c++;
                }
            }else{
//                System.out.print(matrix[r][c]+"  ");
                arr[count++]=matrix[r][c];
                if (r<m-1 && c==0){
                    flag = !flag;
                    r++;
                }else if(r==m-1 ){
                    flag = !flag;
                    c++;
                }else {
                    r++;
                    c--;
                }
            }
        }
        return arr;
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix.length==0){
            return list;
        }
        int tr=0,tc=0;
        int dr=matrix.length-1,dc=matrix[0].length-1;

        while (tr<=dr && tc<=dc){
            if (tr==dr){
                for (int i = tc; i <=dc; i++) {
                    list.add(matrix[tr][i]);
                }
            }else if (dc==tc){
                for (int i = tr; i <=dr; i++) {
                    list.add(matrix[i][dc]);
                }
            }else{
                int curr=tr,curc=tc;
                while (curc!=dc){
                    list.add(matrix[tr][curc]);
                    curc++;
                }
                while (curr!=dr){
                    list.add(matrix[curr][dc]);
                    curr++;
                }
                while (curc!=tc){
                    list.add(matrix[dr][curc]);
                    curc--;
                }
                while (curr!=tr){
                    list.add(matrix[curr][tc]);
                    curr--;
                }
            }
            tr++;
            tc++;
            dr--;
            dc--;
        }
        return list;
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        int[][] arr = new int[numRows][numRows];
        for (int i = 0; i <numRows; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j <=i ; j++) {
                if (j==0 || j==i){
                    arr[i][j]=1;
                }else{
                    arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
                }
                l.add(arr[i][j]);
            }
            lists.add(l);
        }
        return lists;
    }
    public static List<List<Integer>> generate1(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        // First base case; if user requests zero rows, they get zero rows.
        if (numRows == 0) {
            return triangle;
        }
        // Second base case; first row is always [1].
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum-1);
            // The first row element is always 1.
            row.add(1);
            // Each triangle element (other than the first and last of each row)
            // is equal to the sum of the elements above-and-to-the-left and
            // above-and-to-the-right.
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }
            // The last row element is always 1.
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
    public static String addBinary(String a, String b) {
       String res = "";
       int sum = 0;
       int lenA = a.length()-1,lenB = b.length()-1;
       while (lenA>=0 || lenB >=0){
           if (lenA>=0){
               sum+=Integer.parseInt(a.substring(lenA,lenA+1));
               lenA--;
           }
           if (lenB>=0){
               sum+=Integer.parseInt(b.substring(lenB,lenB+1));
               lenB--;
           }
           if (sum==0 ||sum==1){
               res= sum+res;
               sum=0;
           }else if (sum==3){
               res="1"+res;
               sum=1;
           }else if (sum==2){
               res="0"+res;
               sum=1;
           }
       }
        if (sum==1){
            res="1"+res;
        }
        return res;
    }
    public static int strStr(String haystack, String needle) {
        if (needle.length()==0) return 0;
        if (haystack.length()==0 || needle.length()==0) return -1;
        if (needle.length()>haystack.length()) return -1;
        int res=-1;
        if (needle.length()==1){
            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.charAt(i)==needle.charAt(0)){
                    return i;
                }
            }
        }else {
            int i=0,j=0,hLen=haystack.length(),nLen=needle.length();
            int[] next = next(needle);
            while (i<hLen){
                if (j==-1 || haystack.charAt(i)==needle.charAt(j)){
                    i++;j++;
                }else {
                    j=next[j];
                }
                if (j==nLen){
                    res = i-j;
                    break;
                }
            }
        }
        return res;
    }
    static int[] next(String ps){
        int pLength = ps.length();
        int[] next = new int[pLength];
        char[] p=ps.toCharArray();
        next[0]=-1;
        int j=1;
        next[j]=0;
        int k = next[j];
        while (j<pLength-1){
            if (k<0 || p[j]==p[k]){
                next[++j] = ++k;
            }else {
                k=next[k];
            }
        }
        return next;
    }
    public static String longestCommonPrefix(String[] strs) {
        String s = "";
        if (strs.length==0) return s;
        boolean flag = false;
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 0; j <strs.length; j++) {
                if (i>=strs[j].length()){
                    flag=true;break;
                }else if (c!=strs[j].charAt(i)){
                    flag=true;break;
                }else if (j==strs.length-1){
                    s+=c;
                }
            }
            if (flag)
                break;
        }
        return s;
    }
    public static void reverseString(char[] s) {
        int i=0,j=s.length;
        while (i<j){
            char a = s[i];
            char b = s[j];
            s[i]=b;s[j]=a;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(s));
    }
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i+=2) {
            sum+=nums[i];
        }
        return sum;
    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>target) break;
            int a=target-numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                if (a==numbers[j]){
                    arr[0]=i+1;
                    arr[1]=j+1;
                }
            }
        }
        return arr;
    }
    public static int removeElement(int[] nums, int val) {
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        for (int i = 0; i <=k; i++) {
            System.out.println(nums[i]);
        }
        return k;
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
    int max = 0,count=0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i]==1){
            count++;
            if (count>max){
                max=count;
            }
        }else {
            count=0;
        }
    }
    return max;
}
    public static int minSubArrayLen(int s, int[] nums){
        int ans = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        int len = nums.length;
        for (int i = 0; i <len ; i++) {
            sum+=nums[i];
            while (sum>=s){
                ans = Math.min(ans,i-left+1);
                sum-=nums[left++];
            }
        }
        return (ans!=Integer.MAX_VALUE)?ans:0;
    }
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k%len;
        for (int i = 0; i < k; i++) {
            int temp = nums[len-1];
            for (int j = len-2; j >= 0 ; j--) {
                nums[j+1] = nums[j];
            }
            nums[0]=temp;
        }
        for (int x:nums)
            System.out.print(x+" ");
    }
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        long cur=1;
        for (int i = 0; i <=rowIndex ; i++) {
            list.add((int)cur);
            cur = cur*(rowIndex-i)/(i+1);
        }
        return list;
    }
    public static String reverseWords(String s) {
        s=s.trim();
        s=s.replaceAll("\\s{1,}", " ");
        String[] str = s.split(" ");
        String ss = "";
        for (int i = str.length-1; i >= 0; i--) {
            ss+=str[i]+" ";
        }
        ss=ss.trim();
        return ss;
    }
    public static String reverseWords1(String s) {
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            StringBuilder sb1 = new StringBuilder(str[i]);
            if (i==str.length-1)
                sb.append(sb1.reverse());
            else {
                sb.append(sb1.reverse()+" ");
            }
        }
        return new String(sb);
    }
    public static int removeDuplicates(int[] nums) {
        int ans = 1;
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return 1;
        } else {
            int temp = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (temp == nums[i]) {
                    continue;
                } else {
                    temp = nums[i];
                    nums[ans++] = nums[i];
                }
            }
        }
        return ans;
    }
    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        int slow=0,fast=0;
        while (fast<len){
            if (nums[fast]!=0){
                nums[slow]=nums[fast];
                slow++;
                fast++;
            }else {
                fast++;
            }
        }
        for (int i = slow; i < len; i++) {
            nums[i]=0;
        }
    }
}