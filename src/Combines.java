import java.util.ArrayList;
import java.util.List;

public class Combines {
    public static List combines(List list1, List list2){
        int n1 = list1.size();
        int n2 = list2.size();
        int minsize = Math.min(n1, n2);
        List<String> res = new ArrayList<>(n1+n2);
        if(n1==0){
            return list2;
        } else if (n2==0) {
            return list2;
        }

        for(int i=0; i<minsize; i++){
            String str1 = (String) list1.get(i);
            String str2 = (String) list2.get(i);
            res.add(str1);
            res.add(str2);
        }
        if (n1 > n2) {
            res.addAll(list1.subList(n2, n1));
        } else if (n1 < n2) {
            res.addAll(list2.subList(n1, n2));
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        List<String> list2 = new ArrayList<String>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        List<String> ans;
        ans = combines(list2,list1);
        System.out.println(ans.toString());
    }
}
