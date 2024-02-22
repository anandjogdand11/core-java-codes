
public class ErrorHandling{
    public static void  main(String args[]){

        System.out.println("hello world");

        ErrorHandling main= new ErrorHandling();
        try{

        int result=main.divide(1,0);
            System.out.println("print"+result);

        }
        catch(ArithmeticException e){
            System.out.println("Error:devide by zero");

        }
        int anotherResult=main.divide(12222,12222);
        System.out.println(anotherResult);



    }

    int divide(int a ,int c){

        System.out.println("this is devision  code");

        int div=a/c;
        return  div;

    }

}