package exception;

public class ExceptionExam {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[5] = 4;
            System.out.println("arr[5] =  " + arr[5]);

            int num = 0;
            int divide = 10 / num;
            System.out.println(divide);

            String s = null;
            System.out.println(s.length());
        }catch (NullPointerException ex){
            System.out.println(ex);
        }catch (ArithmeticException ex){
            System.out.println(ex);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }


        try{
            int res = 10/2;
            System.out.println("10/2 = " + res);
        }finally {
            System.out.println("Khối lệnh finally luôn đuược thực thi");
        }
        System.out.println("Finished!");
    }
}
