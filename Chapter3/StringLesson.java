package Chapter3;

public class StringLesson {
    public static void main(String[] args) {
        String name = "fluffy";
        String a = "1";
        a = "0";
        a+="2";
        a+="3";
        String b = "1";
        String name2 = "fluffy";
        name = null;
        name2 = null;

        String name3 = new String("fluffy");
        System.out.println(a);
        String word1 = "Stand alone";
        System.out.println(word1.toUpperCase());
        word1= word1.toUpperCase();
        System.out.println(word1.toLowerCase());
        System.out.println(word1);
        String trimSample = "       \t \n \t Marc Yim          \t \n";
        System.out.println(trimSample.trim());
        String names1 = "mabitag";
        String names2 = "mabitag";
        String names3 = "mabitag ";
        //compile time
        System.out.println("names1==names2 = "+(names1==names2));
        System.out.println("names1==names3 = "+(names1==names3));
        System.out.println("names2==names3 = "+(names2==names3));
        //compile time
        System.out.println("names1==names2 = "+(names1==names2));
        System.out.println("names1==names3.trim() = "+(names1==names3.trim()));
        System.out.println("names2==names3.trim() = "+(names2==names3.trim()));
        //runtime
        System.out.println("names1.equals(names2)= "+(names1.equals(names2)));
        System.out.println("names2.equals(names3)= "+(names2.equals(names3)));
        System.out.println("names1.equals(names3)= "+(names1.equals(names3)));

        System.out.println("names1.equals(names2.trim())= "+(names1.equals(names2.trim())));
        System.out.println("names2.equals(names3.trim())= "+(names2.equals(names3.trim())));
        System.out.println("names1.equals(names3.trim())= "+(names1.equals(names3.trim())));
        int x = 2;
        int y = 1;
        x*=y+1;
        System.out.println(x);
}
}