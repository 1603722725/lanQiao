package Test;

public class Test04 {
    //����һ��NxN�ľ���matrix,����������У�ֻ��0��1����ֵ�����ر߿�ȫ��1����������εı�ɳ���
    // {0,1,1,1,1},
    // {0,1,0,0,1},
    // {0,1,0,0,1},
    // {0,1,1,1,1},
    // {0,1,0,1,1}   ���б߿�ȫ��1����������εĴ�С4*4 ����4
    static int[][][] Helper;

    public static void main(String[] args) {
        // TODO �Զ����ɵķ������
        int[][] A = {
                {0, 1, 1, 1, 1},
                {0, 1, 1, 0, 1},
                {0, 1, 0, 1, 1},
                {0, 1, 1, 0, 1},
                {0, 1, 0, 1, 1}
        };
        generalHelpRec(A);
        print(Helper);
        int res = solve(A);
        System.out.println(res);
    }

    private static void print(int[][][] helper) {
        // TODO �Զ����ɵķ������
        for (int i = 0; i < helper.length; i++) {
            for (int j = 0; j < helper.length; j++) {
                System.out.print(helper[i][j][0] + "," + helper[i][j][1] + "\t");
            }
            System.out.println();
        }
    }

    private static void generalHelpRec(int[][] A) {
        // TODO �Զ����ɵķ������
        int N = A.length;
        Helper = new int[N][N][2]; //�����ռ�Helperǰ��λ��ʾ�����±꣬
        //����λ0�����Һϲ��ж��ٸ�1��Ԫ��
        //�����һ�и�ֵ��ʼ��                              //����λ1��ʾ���ºϲ����ٸ�Ԫ�أ�ͳ�����������ֻҪ������ϲ�
        //��ֵ���ڵ���n �Ϳ�����
        int row = N - 1; //���λ�±�
        for (int i = N - 1; i >= 0; i--) {
            int value = A[N - 1][i];
            if (value == 1) {
                if (i == N - 1) {//��ǰλ���������
                    Helper[row][i][0] = 1;
                } else {
                    Helper[row][i][0] = Helper[row][i + 1][0] + 1;
                }
                Helper[row][i][1] = 1;
            }
        }
        row--;//���һ�д����꣬����ȥ��һ��
        //֮���Ե����������һ�У���Ϊ���³�1���ز������һ�����㣬����ֱ����1��ȥ��
        //Ȼ�������漸�е�����
        for (int i = row; i >= 0; i--) {
            for (int j = N - 1; j >= 0; j--) {
                int value = A[i][j];
                if (value == 1) {
                    if (j == N - 1) {
                        Helper[i][j][0] = 1;
                    } else {
                        Helper[i][j][0] = Helper[i][j + 1][0] + 1;
                    }
                    Helper[i][j][1] = Helper[i + 1][j][1] + 1;
                }
            }
        }
    }

    private static int solve(int[][] A) {
        int N = A.length;
        int n = N;
        while (n > 0) {
            for (int i = 0; i < N; i++) {
                if (i + n > N) break;  //��ǰ�����Ҫ����n�߳��������δ�ʱ�Ѿ���������Ȳ���ֱ�����¸�ѭ��
                for (int j = 0; j < N; j++) {//����ѭ����������ȫ����
                    if (j + n > N) break;
                    if (check(i, j, n)) { //���Ϊ��˵���Ѿ������ɹ���ֱ�ӷ��ر���
                        return n;
                    }
                }
            }
            n--;
        }

        return n;
    }

    private static boolean check(int i, int j, int n) {
        // TODO �Զ����ɵķ������
        if (Helper[i][j][0] >= n && Helper[i][j][1] >= n && Helper[i + n - 1][j][0] >= n && Helper[i][j + n - 1][1] >= n) {
            return true;
        }
        return false;
    }
}


