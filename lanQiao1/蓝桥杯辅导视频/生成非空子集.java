package 蓝桥杯辅导视频;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author wl
 * @Data 2020-03-17 23:09
 */
public class 生成非空子集 {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        //Set<Set<Integer>> sets = getSubsets(arr,3);
//        Set<Set<Integer>> sets = getSubsets1(arr,3);
//        System.out.println(sets);
        ArrayList<ArrayList<Integer>> res = getSubsets2(arr,3);
        System.out.println(res);
    }
    public static Set<Set<Integer>> getSubsets(int[]A,int n){
        return getSubsetsCore(A,n,n-1);
    }
    public static Set<Set<Integer>> getSubsetsCore(int[]A,int n,int cur){
        Set<Set<Integer>> newSet = new HashSet<>();
        if (cur==0){
            Set<Integer> nil = new HashSet<>();
            Set<Integer> first = new HashSet<>();
            first.add(A[0]);
            newSet.add(nil);
            newSet.add(first);
            return newSet;
        }
        Set<Set<Integer>> oldSet = getSubsetsCore(A,n,cur-1);

        for (Set<Integer> set:oldSet) {
            newSet.add(set);
            Set<Integer> clone = (Set<Integer>) ((HashSet)set).clone();
            clone.add(A[cur]);
            newSet.add(clone);
        }
        return newSet;
    }

    /**
     * 迭代法
     * @param A
     * @param n
     * @return
     */
    public static Set<Set<Integer>> getSubsets1(int[]A,int n){
        Set<Set<Integer>> res = new HashSet<>();
        res.add(new HashSet<>());
        for (int i = 0; i < n; i++) {
            Set<Set<Integer>> new_res= new HashSet<>();
            new_res.addAll(res);
            for (Set e:res) {
                Set clone = (Set) ((HashSet)e).clone();
                clone.add(A[i]);
                new_res.add(clone);
            }
            res=new_res;
        }
        return res;
    }

    /**
     * 二进制迭代
     * @param A
     * @param n
     * @return
     */
    public static ArrayList<ArrayList<Integer>> getSubsets2(int[] A,int n){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(A);
        for(int i = (int)(Math.pow(2,n)-1); i>0; i--){
            ArrayList<Integer> s = new ArrayList<>();
            for (int j = n-1; j>=0; j--){
                if(((i>>j)&1) == 1){
                    s.add(A[j]);
                }
            }
            res.add(s);
        }
        return res;
    }
}
