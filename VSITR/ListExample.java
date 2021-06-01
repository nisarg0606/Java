package VSITR;

import javax.swing.*;  
public class ListExample  
{  
     ListExample(){  
        JFrame f= new JFrame();  
        DefaultListModel<String> l1 = new DefaultListModel<>();  
          l1.addElement("Apple");  
          l1.addElement("Mango");  
          l1.addElement("Banana");  
          l1.addElement("Litchi");  
          JList<String> list = new JList<>(l1);  
          list.setBounds(100,100, 75,75);  
          f.add(list);  
          f.setSize(400,400);  
          f.setLayout(null);  
          f.setVisible(true);  
     }  
public static void main(String args[])  
    {  
   new ListExample();  
    }}