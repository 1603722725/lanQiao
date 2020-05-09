package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wl
 * @Data 2020-04-30 12:23
 */
public class N�ʺ����� {
    private static List<List<String>> output = new ArrayList<>();

    // ���ڱ���Ƿ��з���Ļʺ󱻹���
    static int[] rows;
    // ���ڱ���Ƿ����Խ��߷���Ļʺ󹥻�
    static int[] mains;
    // ���ڱ���Ƿ񱻴ζԽ��߷���Ļʺ󹥻�
    static int[] secondary;
    // ���ڴ洢�ʺ���õ�λ��
    static int[] queens;

    static int n;

    public  static void main(String[] args) {
        System.out.println(solveNQueens(3));
    }

    public static List<List<String>> solveNQueens(int n) {
        // ��ʼ��
        rows = new int[n];
        mains = new int[2 * n - 1];
        secondary = new int[2 * n - 1];
        queens = new int[n];
        N�ʺ�����.n = n;
        // �ӵ�һ�п�ʼ������� N �ʺ�
        backtrack(0);
        return output;
    }

    // ��һ���з���һ���ʺ�
    private static void backtrack(int row) {
        if (row >= n) return;
        // �ֱ����� row ���е�ÿһ���з��ûʺ�
        for (int col = 0; col < n; col++) {
            // �жϵ�ǰ���õĻʺ󲻱������ʺ�Ĺ���
            if (isNotUnderAttack(row, col)) {
                // ѡ���ڵ�ǰ��λ���Ϸ��ûʺ�
                placeQueen(row, col);
                // ����ǰ�������һ�У����ҵ���һ���������
                if (row == n - 1) addSolution();
                // ����һ���з��ûʺ�
                backtrack(row + 1);
                // ���������ݣ�������ǰλ�õĻʺ�ȥ��
                removeQueen(row, col);
            }
        }
    }

    // �ж� row �У�col �����λ����û�б���������Ļʺ󹥻�
    private static boolean isNotUnderAttack(int row, int col) {
        // �жϵ��߼��ǣ�
        //      1. ��ǰλ�õ���һ�з���û�лʺ󹥻�
        //      2. ��ǰλ�õ����Խ��߷���û�лʺ󹥻�
        //      3. ��ǰλ�õĴζԽ��߷���û�лʺ󹥻�
        int res = rows[col] + mains[row - col + n - 1] + secondary[row + col];
        // �����������û�й����Ļ����� res = 0������ǰλ�ò����κεĻʺ󹥻�
        return res == 0;
    }

    // ��ָ����λ���Ϸ��ûʺ�
    private static void placeQueen(int row, int col) {
        // �� row �У�col �� ���ûʺ�
        queens[row] = col;
        // ��ǰλ�õ��з����Ѿ��лʺ���
        rows[col] = 1;
        // ��ǰλ�õ����Խ��߷����Ѿ��лʺ���
        mains[row - col + n - 1] = 1;
        // ��ǰλ�õĴζԽ��߷����Ѿ��лʺ���
        secondary[row + col] = 1;
    }

    // �Ƴ�ָ��λ���ϵĻʺ�
    private static void removeQueen(int row, int col) {
        // �Ƴ� row ���ϵĻʺ�
        queens[row] = 0;
        // ��ǰλ�õ��з���û�лʺ���
        rows[col] = 0;
        // ��ǰλ�õ����Խ��߷���û�лʺ���
        mains[row - col + n - 1] = 0;
        // ��ǰλ�õĴζԽ��߷���û�лʺ���
        secondary[row + col] = 0;
    }

    /**
     * �����������Ļʺ�λ�÷���output��
     */
    public static void addSolution() {
        List<String> solution = new ArrayList<String>();
        for (int i = 0; i < n; ++i) {
            int col = queens[i];
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < col; ++j) sb.append(".");
            sb.append("Q");
            for(int j = 0; j < n - col - 1; ++j) sb.append(".");
            solution.add(sb.toString());
        }
        output.add(solution);
    }
}
