package Demo;
import java.math.BigDecimal;
import java.text.NumberFormat;
/**
 * @author wl
 * @Data 2020-08-12 11:50
 */
public class Test07 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(10);
        BigDecimal b = new BigDecimal(3);
        BigDecimal divide = a.divide(b,3);
        System.out.println(divide);
//        NumberFormat currency = NumberFormat.getCurrencyInstance(); //�������Ҹ�ʽ������
//        NumberFormat percent = NumberFormat.getPercentInstance();  //�����ٷֱȸ�ʽ������
//        percent.setMaximumFractionDigits(3); //�ٷֱ�С�������3λ
//
//        BigDecimal loanAmount = new BigDecimal("15000.48"); //������
//        BigDecimal interestRate = new BigDecimal("0.008"); //����
//        BigDecimal interest = loanAmount.multiply(interestRate); //���
//
//        System.out.println("������:\t" + currency.format(loanAmount));
//        System.out.println("����:\t" + percent.format(interestRate));
//        System.out.println("��Ϣ:\t" + currency.format(interest));
    }
}
