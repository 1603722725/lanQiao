package leetcode;

import sun.text.resources.cldr.or.FormatData_or;

import javax.print.attribute.SetOfIntegerSyntax;
import java.nio.channels.NonReadableChannelException;
import java.util.*;

/**
 * @author wl
 * @Data 2020-02-27 14:40
 * LeetCode 哈希表
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbacb"));

    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> hash = new HashSet<>();
        for (Integer i : nums) {
            if (hash.contains(i))
                return true;
            hash.add(i);
        }
        return false;
    }

    public static int singleNumber(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(nums[i])) {
                hashSet.remove(nums[i]);
            } else {
                hashSet.add(nums[i]);
            }
        }
        int res = hashSet.iterator().next();
        return res;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                set1.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] arr = new int[set1.size()];
        int j = 0;
        for (Integer i : set1) {
            arr[j] = i;
        }
//            System.out.println(i);
        return arr;
    }

    public static boolean isHappy(int n) {
        int temp = n;
        while (true) {
            temp = getNext(n);
            if (temp == 1) {
                return true;
            } else if (temp == 89) {
                return false;
            }

        }
    }

    public static int getNext(int n) {
        int res = 0;
        while (n > 0) {
            res += (n % 10) * (n % 10);
            n /= 10;
        }
        return res;
    }

    public static boolean isHappy01(int n) {
        int num = n;
        if (num < 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        while (num != 1) {
            int sum = 0;
            char[] c = String.valueOf(num).toCharArray();
            for (int i = 0; i < c.length; i++) {
                int d = Integer.parseInt(new String(c, i, 1));
                sum += d * d;
            }
            num = sum;
            if (set.contains(num))
                return false;
            else
                set.add(num);
        }
        return true;
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int a = target - nums[i];
            map.remove(i);
            if (map.containsValue(a)) {
                arr[0] = i;
                for (Integer key : map.keySet()) {
                    if (map.get(key) == a)
                        arr[1] = key;
                }
            }
        }
        return arr;
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                if (set.contains(t.charAt(i))) {
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
                set.add(t.charAt(i));
            } else {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + k]) {
                return true;
            }
        }
        return false;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> map = new HashMap<>();
        for (String str : strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String temp = String.valueOf(c);
            if (!map.containsKey(temp)) {
                map.put(temp, new ArrayList());
            }
            map.get(temp).add(str);
        }
        return new ArrayList(map.values());
    }

    public static boolean isValidSudoku(char[][] board) {
        int[][] row = new int[10][9];
        int[][] col = new int[10][9];
        int[][] table = new int[10][9];
        for(int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                int num = board[i][j]-'0';
                if (board[i][j]!='.'&&(++row[num][i]>=2 || ++col[num][j]>=2 || ++table[num][i/3*3+j/3]>=2)){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 宝石与石头
     * @param J
     * @param S
     * @return
     */
    public int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i))){
                count++;
            }
        }
        return count;
    }

    /**
     * 无重复字符的最长子串
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s){
        HashSet<Character> hashset = new HashSet<>();
        char[] ss = s.toCharArray();
        int res = 0;
        int l = 0, r = -1;
        while(l < ss.length){
            res = Math.max(res, r - l + 1);
            if( r + 1 < ss.length && !hashset.contains(ss[r+1])){
                hashset.add(ss[++r]);
            }else {
                hashset.remove(ss[l++]);
            }
         }
         return res;
    }
    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        int len=A.length;
        for(int a:A) {
            for(int b:B) {
                map.merge(a+b, 1, (v1,v2)->v1+1);
            }
        }
        int res=0;
        for(int c:C) {
            for(int d:D) {
                res+=map.getOrDefault(0-c-d, 0);
            }
        }
        return res;
    }
}
//class MyHashMap {
//    int[] arr = new int[1000001];
//    /** Initialize your data structure here. */
//    public MyHashMap() {
//        Arrays.fill(arr,-1);
//    }
//
//    /** value will always be non-negative. */
//    public void put(int key, int value) {
//        arr[key] = value;
//    }
//
//    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
//    public int get(int key) {
//        return arr[key];
//    }
//
//    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
//    public void remove(int key) {
//        arr[key] = -1;
//    }
//}