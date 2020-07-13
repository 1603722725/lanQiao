package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wl
 * @Data 2020-02-19 17:39
 */
public class Test03 {
    public static void main(String[] args) {
        List<Addr> list = new ArrayList<>();
        Addr addr1 = new Addr("����", "�й�", "����", "�ϲ�", "��ɽ");
        Addr addr2 = new Addr("����", "�й�", "�㶫", "����", "����");
        list.add(addr1);
        list.add(addr2);
        for (Addr ll : list) {
            System.out.println(ll.name + "   " + ll.country + "  " + ll.province + "  " + ll.city + "  " + ll.street);
        }
        // System.out.println(list);
    }

    /**
     * ��дһ������ʹ�ü��ϴ洢�ͻ����ʼ���ַ����ַ��Ӧ�ð����������ֵ����У��أ���ʡ���������������ң�������Ȼ����ʾ�����е����ݣ�Ҫ��ʹ�ü��϶�����ʵ��
     */
    static class Addr {
        String name;
        String country;
        String province;
        String city;
        String street;

        public Addr(String name, String country, String province, String city, String street) {
            this.name = name;
            this.country = country;
            this.province = province;
            this.city = city;
            this.street = street;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "name='" + name + '\'' +
                    ", country='" + country + '\'' +
                    ", province='" + province + '\'' +
                    ", city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    '}';
        }
    }
}
