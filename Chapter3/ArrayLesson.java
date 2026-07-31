package Chapter3;
import java.util.*;
public class ArrayLesson {
    public static void main(String...  args  ) {
        int [] i = new int[3];
        int[] numbers2 = new int[]{1,54,75}; 
        int[] numbers3 = {1,54,75};
        Student[] batch2 = {new Student(),new Student(),new Student(),new Student(),null};
        for(int j = 0; j<numbers3.length;j++)
            System.out.println(numbers3[j]);
        int[] numbers4 = {1,54,75,5,76,34,7,3,8,10,34};
        Arrays.sort(numbers4);
        for(int number4: numbers4)
            System.out.print(number4+", ");
}
}

class Student{
    String fullname;
    int age;
    String address;
    String course;
    int yearLevel;
}