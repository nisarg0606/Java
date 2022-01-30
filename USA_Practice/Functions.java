package USA_Practice;

// Find the middle char of a string using function
// i) if string length is odd then print 1 characters
//  ii) if even then two character
// In this program basically string's functions will be used like substring .length 
// you need to figure out how substring function works
// make a program to figure out how substring function works
// take a string from the user and print 2nd to 5th substring
// eg: Reyaansh  -> eyaan
class Function {

    public static void main(String[] args) {
        String name = "Reyaansh";// the output should be aa
        // name = name.substring(2, 6);// starting index to ending index - 1// the ending index is exclusive 
        // System.out.println(name);
        System.out.println(name.length());
        String name1 = "Kairavy";// the output should be r
        System.out.println(name1.length());
    }
}