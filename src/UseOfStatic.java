public class UseOfStatic {
   int a=0;
    // static int a=0;
    //int a =0;

    public static void main(String[] args) {
        int b=1;
       // System.out.println(a);//cant print a because a is a global varible and not static
        System.out.println(b);// can print b because b is a local variable
//inorder to print a, either we make int static a or create an object that calls a
        //optiion1: static a
        //System.out.println(a); //prints a =0
        //option2. create an object that calls a
        UseOfStatic s=new UseOfStatic();
        System.out.println(s.a);//prints a=0
    }
}
