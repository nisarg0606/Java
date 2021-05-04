package RahulSir.ComparatorAndComparable;

import java.util.Comparator;

public class StdWiseStudentComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2)
    {
        if(s1.getstd() > s2.getstd())
            return 1;
        else if(s1.getstd() < s2.getstd())
            return -1;
        else 
            return 0;
    }
}