package exception_handling;

public class TryCatch {
    public static void main(String[] args) {
        int num = 10;
        int result = 0;

        try{
            result = num /0;
        }

      catch (Exception e){
          System.out.println("Errors occurs when divisible by the zero:");
          System.out.println("Result is :" + result);
      }
    }
}
