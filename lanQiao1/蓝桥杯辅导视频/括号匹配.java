package

���ű�������Ƶ;
import java.util.HashSet;
import java.util.Set;
/**
 * @author wl
 * @Data 2020-03-16 22:01
 */
public class ����ƥ�� {
public static void main(String[]args){
        System.out.println(p(3));
        }
static Set<String> p(int n){
        Set<String> res=new HashSet<>();
        res.add("()");
        if(n==1)
        return res;
        for(int i=2;i<=n;i++){
        Set<String> new_res=new HashSet<>();
        for(String e:res){
        new_res.add(e+"()");
        new_res.add("()"+e);
        new_res.add("("+e+")");
        }
        res=new_res;
        }
        return res;
        }
        }
