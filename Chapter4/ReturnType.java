package Chapter4;

import java.lang.invoke.StringConcatException;

public class ReturnType {
    void startEngine(){
        return;
    }
    int getAge(){ 
        return (byte) 23;
        // System.out.println(); //☠️
        // int sety(){}  //☠️
        
    }
    Avocado getAvocado(){
        return null;
    }
    boolean oddOrEven(int a){
        // boolean result = ((a%2)==0) ? true : false;
        // return result;
        return ((a%2)==0) ? true : false;
    }
    int addTwoNumbers(int a,int b){
        return a+b;
    }
    //optional exception
    int compareTwoStrings( String a, String b) throws 
        StringConcatException,
        StringIndexOutOfBoundsException
        {
        return 0;
    }
    int compareThreeStrings( String a, String b, String c) throws 
        StringConcatException,
        StringIndexOutOfBoundsException,
        IllegalArgumentException
        {
        return 0;
    }
    //method body
    void emptyBody(){}
    void withBody(){
        System.out.println("with method body");
    }
    boolean withBodyUsingCondition(int a){
        // boolean result =false;
        // if(a==1)
        //     result =true;
        // return  result;
        return (a==1)?true:false;
    }

    
    public static void main(String[] args) {
        ReturnType rt = new ReturnType();
        System.out.println("Good Morning you are now "+ rt.getAge()+" years old");
        int y = 123230,z = 1;
        System.out.println("is the value "+y+" even number?: "+rt.oddOrEven(y));
        System.out.println("a = "+y+"\nb = "+z+"\na + b = "+rt.addTwoNumbers(y, z));
        Avocado avodado = new Avocado();
        rt.getAvocado();
        
    }
}

class Avocado{

}