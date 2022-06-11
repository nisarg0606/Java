package USA_Practice.Collection;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList  = new ArrayList<String>();
        arrayList.add("Reyaansh");
        arrayList.add("Nidish");
        arrayList.add("Soham");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println(arrayList);
        StudentBean studentBean = new StudentBean("Soham", 15, 1);

        ArrayList<StudentBean> studentBeans = new ArrayList<StudentBean>();
        studentBeans.add(studentBean);
        System.out.println(studentBean.getRollNo());
        System.out.println(studentBean.getName());
        System.out.println(studentBean.getAge());
    }
}
