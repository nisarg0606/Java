package USA_Practice.AccessModifier;

public class AccessModifierExample {
    private int i = 10;

    private void msg() {
        System.out.println("This is a private method");
    }

    void DefaultExample() {
        System.out.println("This is a Default method");
    }

    protected void ProtectedExample() {
        System.out.println("This is a Protected Method");
    }

    public static void main(String[] args) {
        // Private
        AccessModifierExample accessModifierExample = new AccessModifierExample();
        System.out.println(accessModifierExample.i);
        accessModifierExample.msg();
        // Default
        // Protected
        // public
    }
}

class B {
    public static void main(String[] args) {
        AccessModifierExample obj = new AccessModifierExample();
        // System.out.println(obj.i);
        // System.out.println(obj.msg());
        // Note: Private Variables/methods are not visible to any other class expect the
        // implementation class
        obj.DefaultExample();
        // Observation -> Default methods are visible to the package classes
        obj.ProtectedExample();
    }
}
