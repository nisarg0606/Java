package aarsh;

public class CallByValue_Reference {
    int i = 10;

    int callByValue(int i) {
        i = i + 50;
        return i;
    }

    int callByReference(CallByValue_Reference callByValue_Reference) {
        callByValue_Reference.i = callByValue_Reference.i + 60;
        return callByValue_Reference.i;
    }

    public static void main(String[] args) {
        CallByValue_Reference callByValue_Reference = new CallByValue_Reference();
        System.out.println(callByValue_Reference.callByValue(50));
        System.out.println(callByValue_Reference.i);
        System.out.println(callByValue_Reference.callByReference(callByValue_Reference));
        System.out.println(callByValue_Reference.i);
    }
}
