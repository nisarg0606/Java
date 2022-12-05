import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// interface Memo()
// {

// }
// interface Voucher()
// {

// }

// class Order implements Memo, Voucher
// {

// }

// class ERPOrder extends Order implements Voucher{}


public class Testing {
    public static void main(String[] args) {
        // String s = "sample";

        // Order p1 = new Order();
        // Order p2 = new ERPOrder();
        // ERPOrder e2 = new ERPOrder();

        // if(p1 instanceof Memo && p2 instanceof Voucher)
        //     s += "1";
        // if((e2 instanceof Memo) && (e2 instanceof Voucher))
        //     s += "2";

        // System.out.println(s);
        List lst = new ArrayList<>();
        lst.add(new Integer(11).intValue());
        lst.add(new String("Hello"));
        lst.add(new Boolean(true));
        Arrays.sort(lst.toArray());

        for(int i = 0; i < lst.size(); i++)
            System.out.println(lst.get(i).toString());
    }    
}
