package DivaKhushi;
public class CallByValue {
    int data = 50;// global varible
    void Change(int data) {// I am calling this method then in the background this method is getting
        // memory for doing stuff... So value is changing and it is limited to this
        // scope only...
        data = data + 100;
        System.out.println("The value of data in change method is: " + data);
    }
    void ValueChange(CallByValue ob) {
        ob.data = ob.data + 100;
    }
    void display() {
        System.out.println("The data is: " + data);
    }
    public static void main(String[] args) {
        CallByValue obj = new CallByValue();
        // System.out.println("Before calling Change method: " + obj.data);
        // obj.Change(800);
        // System.out.println("After calling Change method: " + obj.data);
        System.out.println("Before calling ValueChange method: " + obj.data);
        obj.ValueChange(obj);
        System.out.println("After calling ValueChange method: " + obj.data);
        obj.display();
        System.out.println("----------------");
        CallByValue newobj = new CallByValue();
        newobj.display();
        System.out.println("----------------");
        obj.display();
    }
}