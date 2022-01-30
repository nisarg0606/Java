package USA_Practice;

// Find the middle char of a string using function
// i) if string length is odd then print 2 characters
//  ii) if even then one character
// In this program basically string's functions will be used like substring .length 
// you need to figure out how substring function works
// make a program to figure out how substring function works
// take a string from the user and print 2nd to 5th substring
// eg: Reyaansh  -> eyaan
class Function {

    public static void main(String[] args) {
        String name = "Reyaansh";
        name = name.substring(1, 6);
        System.out.println(name);
    }
}