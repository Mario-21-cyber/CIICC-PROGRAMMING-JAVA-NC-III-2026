package Chapter3;
import java.util.*;

public class ArrayListLesson {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add('c');
        list1.add(true);
        list1.add("asdfa");
        System.out.println(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(21);
        list2.add(11);
        list2.add(54);
        list2.add(4);
        System.out.println(list2.add(2));
        list2.add(0,10);
        System.out.println(list2);
        int q = 10;
        Integer w =20;
        List nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        System.out.println(nums);
        nums.remove(1);
        System.out.println(nums);
        List nums2 = Arrays.asList(8,7,2,3,4,4,1,9,5,6);
        Collections.sort(nums2);
        List list3 = new ArrayList<>(nums2);
        System.out.println(nums2);
        Collections.reverse(nums2);
        System.out.println(nums2);
        Collections.shuffle(nums2);
        System.out.println(nums2);
        //q[5]
        //a[5]
        //q[1]==1 and a[1]==1
        List<Pupil> pupils = new ArrayList<>();
        pupils.add(new Pupil("marco",7,2));
        pupils.add(new Pupil("Reynaldo",8,3));
        pupils.add(new Pupil("Kimberly",8,3));
        System.out.println(pupils);
        pupils.get(1).gradeLevel = 2;
        System.out.println(pupils);
    }
}
class Pupil{
    Pupil(String name,int age,int gradeLevel){
        this.name=name ;
        this.age=age ;
        this.gradeLevel=gradeLevel ;
    }
    String name;
    int age;
    int gradeLevel;
}