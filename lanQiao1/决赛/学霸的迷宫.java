package

����;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ����
 * @date 2019/5/7 - 23:34
 * BFS
 */
public class ѧ�Ե��Թ�{
public final static int[][]move={{-1,0},{1,0},{0,-1},{0,1}};//�ֱ��ʾ���ϡ��¡������ƶ�һ��
public final static String[]onePath={"U","D","L","R"};       //�ֱ��ʾ���ϡ��¡���������

static class point {       //�ڲ��࣬���ڱ�ʾ��ǰ���ߵ������Ϣ
    public int x;         //��ǰ����λ�ú�����
    public int y;         //��ǰ����λ��������
    public int step;      //���ߵ���ǰ���������ܲ���
    public String path;   //���ߵ���ǰ����ľ���·��

    point(int x, int y, int step, String path) {
        this.x = x;
        this.y = y;
        this.step = step;
        this.path = path;
    }

}

    //�жϵ�ǰλ���Ƿ��ǿ����ߵ�λ�ã��粻�ܷ���false�����򷵻�true
    public boolean check(int[][] matrix, point a) {
        int n = matrix.length - 1, m = matrix[0].length - 1;
        if (a.x < 1 || a.x > n || a.y < 1 || a.y > m || matrix[a.x][a.y] == 1)
            return false;
        return true;
    }

    //�����ֵ���{D,L,R,U}���Ƚ��ַ���A��B�Ĵ�С�����A > B����true�����򷵻�false(PS:�����ַ�������ͬ)
    public boolean judge(String A, String B) {
        char[] arrayA = A.toCharArray();
        char[] arrayB = B.toCharArray();
        for (int i = 0, len = A.length(); i < len; i++) {
            if (arrayA[i] < arrayB[i])
                return false;
        }
        return true;
    }

    //���������ݣ��任Ϊ����
    public int[][] getMatrix(String[] A, int m) {
        int[][] matrix = new int[A.length + 1][m + 1];
        for (int i = 0; i < A.length; i++) {
            char[] arrayA = A[i].toCharArray();
            for (int j = 0; j < m; j++)
                matrix[i + 1][j + 1] = arrayA[j] - '0';
        }
        return matrix;
    }

    public void bfs(String[] A, int m) {
        int[][] matrix = getMatrix(A, m);
        ArrayList<point> list = new ArrayList<point>();
        list.add(new point(1, 1, 0, ""));   //��ʾ�Ӷ���(1,1)����
        int minStep = Integer.MAX_VALUE;  //���ڼ�¼�������ն����������ٲ���
        String minPath = "";         //���ڼ�¼�������ն���·������С�ֵ�������
        while (list.size() != 0) {
            point begin = list.get(0);  //��ȡ�����һ�����㣬��ʼ����bfs����
            list.remove(0);       //ɾ�����б�������ʼ��

            if (begin.x == matrix.length - 1 && begin.y == matrix[0].length - 1) {  //���ö���Ϊ�յ�ʱ
                if (minStep > begin.step) {
                    minStep = begin.step;
                    minPath = begin.path;
                } else if (minStep == begin.step) {
                    if (judge(minPath, begin.path))  //��minPath�ֵ������begin.stepʱ
                        minPath = begin.path;
                }
                continue;   //�˴��Ѿ����յ㣬����Ҫ��������bfs����
            }

            for (int i = 0; i < 4; i++) {  //���δ�ﵽ���ն���(n, m)������bfs����(�ֱ����ϡ��¡������ƶ�)
                int x = begin.x + move[i][0];
                int y = begin.y + move[i][1];
                int step = begin.step + 1;
                String path = begin.path + onePath[i];
                point temp = new point(x, y, step, path);
                if (check(matrix, temp)) {  //������temp�ǿɵ���Ķ���ʱ
                    list.add(temp);
                    matrix[x][y] = 1;  //����ö���󣬱�Ǹö��㲻�ɵ���˴������Ǵ������˼�����������������丸ĸ���㲻�ɵ��������г�ʱ��
                }
            }
        }
        //������ս��
        System.out.println(minStep + "\n" + minPath);
        return;
    }

    public static void main(String[] args) {
        ѧ�Ե��Թ�test = new ѧ�Ե��Թ�();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();  //�˴��ر�ע�⣬�����������������������ַ������˴������в���
        String[] A = new String[n];
        for (int i = 0; i < n; i++)
            A[i] = in.nextLine();
        test.bfs(A, m);
    }
}
