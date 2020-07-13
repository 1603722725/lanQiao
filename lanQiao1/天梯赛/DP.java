package ������;

public class DP {
    //1. ����������У�LCS����
    public static int LCS(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m + 1][n + 1];
        //if(str1.charAt(i)==str2.charAt(j)) dp[i][j]==dp[i-1][j-1]+1;
        //else dp[i][j]=max(dp[i-1][j],dp[i][j-1])
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[m][n];
    }

    //2.��������ַ�����LCS����
    public static int LCString(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int longest = 0;
        int[][] dp = new int[m + 1][n + 1];  // ��ʾ����Ϊmn�������Ӵ���lcs
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = 0;
                longest = Math.max(longest, dp[i][j]);
            }
        }
        return longest;
    }

    //3.����������У�LIS������̬�滮n2�ⷨ
    public static int LISDP(int[] a) {
        int[] dp = new int[a.length + 1];
        int res = 0;
        for (int i = 1; i < a.length + 1; i++) {
            int max = 0;
            for (int j = 1; j < i; j++) {
                if (a[j - 1] <= a[i - 1] && dp[j] > max)
                    max = dp[j];
            }
            dp[i] = max + 1;
            if (res < dp[i])
                res = dp[i];
        }
        return res;
    }
    //3.����������У�LIS��nlogn�ⷨ��

    //LIS�ж�̬�滮��LCSתLIS������+LCS������ n2����������һ��nlogn�������£�
    //����һ��LIS��������ԭ����LIS������֤��ĩλ��
    static int len = 0;

    public static int LIS(int[] arr) {
        int[] lis = new int[arr.length];
        lis[0] = arr[0];  //ĿǰLIS���г���Ϊ1��ĩβΪarr[0]
        len = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= lis[len - 1]) {
                lis[len] = arr[i];
                len++;
            } else {
                lis[binarysearch(lis, arr[i])] = arr[i];
            }
        }
        return len;
    }

    private static int binarysearch(int[] a, int key) {
        int left = 0;
        int right = len - 1;
        int mid = (left + right) / 2;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (a[mid] < key)
                left = mid + 1;
            else
                right = mid;
        }
        return left;//right is also ok
    }

    //4.�༭�������⣺
    public static int editdis(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int[][] edit = new int[m + 1][n + 1]; // ��ֹ�Ͷ�Խ���Լ��������i
        for (int i = 0; i <= m; i++)
            edit[i][0] = i;
        for (int i = 0; i <= n; i++)
            edit[0][i] = i;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {   // �������jд��i�Ǻܳ�����һ������
                if (j > i) edit[i][j] = edit[i][i] + j - i;
                else if (j < i) edit[i][j] = edit[j][j] + i - j;
                else {
                    if (str1.charAt(i - 1) == str2.charAt(j - 1))
                        edit[i][j] = edit[i - 1][j - 1];
                    else
                        edit[i][j] = edit[i - 1][j - 1] + 1;
                }
            }
        }
        return edit[m][n];
    }

    //5.�ж��Ƿ�Ϊ������
    public static boolean isSubSeq(String str1, String str2) {
        int pointer1 = 0;
        int pointer2 = 0;
        while (pointer1 < str1.length() && pointer2 < str2.length()) {
            if (str1.charAt(pointer1) == str2.charAt(pointer2))
                pointer2++;
            if (pointer2 == str2.length()) return true;
            pointer1++;
        }
        return false;
    }

    public static void main(String[] args) {
        //���Գ����ж��Ƿ�Ϊ�Ӵ���
        System.out.println("abcsdf".contains("abcd"));
        //���Գ����ж��Ƿ�Ϊ�����У�
        System.out.println(isSubSeq("abscdljjkjkefg", "abcdefg"));
        //���Գ����������������еĳ���
        System.out.println(LCS("abscljjkjkefg", "abcdefg"));
        //���Գ�����������������LIS nlogn
        int[] a = {1, 4, 6, 2, 3, 5, 7};
        System.out.println(LIS(a));
        //���Գ�����������������LISDP n2
        System.out.println(LISDP(a));
        //���Գ��������������ַ�������
        System.out.println(LCString("abscljjkjkdefg", "abcdefg"));  //3
        //���Գ��򣺱༭����
        System.out.println(editdis("kitten", "sitting"));  //3

        //int[] b={1,2,6};
        //System.out.println(binarysearch(b,3));
    }
}
