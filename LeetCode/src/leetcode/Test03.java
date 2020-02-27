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
        Addr addr1 = new Addr("张三","中国","江西","南昌","南山");
        Addr addr2 = new Addr("李四","中国","广东","深圳","布吉");
        list.add(addr1);
        list.add(addr2);
        for (Addr ll:list) {
            System.out.println(ll.name+"   "+ll.country+"  "+ll.province+"  "+ll.city+"  "+ll.street);
        }
       // System.out.println(list);
    }
    /**
     * 编写一个程序，使用集合存储客户的邮件地址。地址中应该包含姓名，街道，市（县），省（自治区），国家（地区）然后显示集合中的内容；要求使用集合对象来实现
     */
    static class Addr{
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
