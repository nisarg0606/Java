package USA_Practice;

public class StringBufferExample {
    public static void main(String[] args) {
        // String vs String Buffer
        // The main difference is that Strings are immuatable..... but StringBuffer is
        // muatable(modifiable)
        // Some methods that are provided by StringBuffer are:
        // append
        // insert
        // replace
        // delete
        // reverse
        // capacity
        // chatAt
        // substring

        // Mutable vs Immutable
        // Changable NonChangable

        // Append method
        StringBuffer stringBuffer = new StringBuffer("Hello ");
        // StringBuffer() --> it creates the empty string of length(initial Capacitiy)
        // 16
        // StringBuffer(String str)
        // StringBuffer(int capacity)
        stringBuffer.append("World");
        System.out.println(stringBuffer);

        // insert Method
        stringBuffer.insert(1, "n");
        System.out.println(stringBuffer);

        // replace Method
        stringBuffer.replace(1, 3, "Java");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer);

        // delete Method

        stringBuffer.delete(8, 14);
        System.out.println(stringBuffer);

        // reverse Method

        stringBuffer.reverse();
        System.out.println(stringBuffer);

        // take a array of Strings
        // store it in another array
        // display it

    }
}
