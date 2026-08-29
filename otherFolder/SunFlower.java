package otherFolder;

import Chapter4.AccessModifier;
import otherFolder.a.A;

public class SunFlower {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.secretCode);
        AccessModifier acm1 = new AccessModifier();
        acm1.greetMe();
        // acm1.greetMe2();
        // acm1.greetMe3();
        // acm1.greetMe4();
        
    }
}class MoonFlower extends AccessModifier{
    public static void main(String[] args) {
        MoonFlower mf = new MoonFlower();
        mf.greetMe();
        mf.greetMe3();
        // mf.greetMe4();
        
    }
}