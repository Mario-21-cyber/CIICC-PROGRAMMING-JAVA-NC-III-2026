package Chapter2;

public class OperatorsLesson {
    public static void main(String[] args) {
        

        // shift ops
        System.out.println(2<<2);
        System.out.println(15>>1);
        //0 0 1 0
        //8 4 2 1

        //01 1 1 1 
        System.out.println(+3 + +6);
        int a = 0;
        System.out.println(a++);
        System.out.println(a);//1
        System.out.println(++a);//2
        System.out.println(a);
        short x = 10;
        short y = 30;
        short z =(short) (x*y);
        System.out.println("z="+z);
        int p = 3;
        System.out.println(++p+p++);//p=4, 4+4=8
        System.out.println(p);//5
        // ++p++;
        p=+p++;
        boolean isFalse = false;
        System.out.println(!!!!!!!!!!!!!!isFalse);
        boolean isFailed = false, isFailed3;
        boolean isFailed2=isFailed3=isFailed=true;
        System.out.println(isFailed);
        System.out.println(isFailed3);
        System.out.println(isFailed2);
        isFailed=false;
        isFailed3=false;
        isFailed2=false;
    }
}

//  Elements: Fire, Water, Grass, and Electric.: Normal, Flying, Bug, Ground, Rock, and Ice.: Psychic, Ghost, Dragon, and Fairy.: Fighting, Poison, Dark, and Steel.

// class Basic{
//     String Fire;
//     String Water;
//     String Grass;
//     String Electric;
// }
// class PhysicalNatural{}
// class MysticalSpecial{}
// class CombatAffliction{}