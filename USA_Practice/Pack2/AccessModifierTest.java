package USA_Practice.Pack2;

import USA_Practice.AccessModifier.AccessModifierExample;

public class AccessModifierTest extends AccessModifierExample {
    public static void main(String[] args) {
        // you can access method which are protected using inheritance
        // accessModifierExample.de
        // Observation -> You cannot access Default methods in different Package
        AccessModifierTest accessModifierTest = new AccessModifierTest();
        accessModifierTest.ProtectedExample();
    }
}
