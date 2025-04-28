package Numberprograms.javaopps;
import java.util.Scanner;
public class method {
     
    public static void work(){
        System.out.println("static work");
    }
    public int add(int a,int b){
        int i=0;
        for(i=a;i<b;i++){
            System.out.println(i);
        }
        return i;
    }
    public static void main(String[] args) {
        work();
        method m=new method();
        int num=m.add(2,10);
        System.out.println(num);
    }
}
