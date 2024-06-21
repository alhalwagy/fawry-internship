public class Main {
    public static void main(String[] args) {

        //Method 1 ----- method return output and saved it in variable
        int result = add(5,6);
        System.out.println(result);

        //Method 2 ----- methode accept method as arguments
        String name = "ahmed";
        register(name, Main::sendWelcomeMail);

        //Method 3 ----- method return method as output

        Multiply doubleNumber=multiply(2);
        Multiply tripleNumber=multiply(3);

        System.out.println(doubleNumber.multiply(4));
        System.out.println(tripleNumber.multiply(4));
        System.out.println(multiply(5).multiply(6));


    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static void sendWelcomeMail(String email){
        System.out.println("Welcome :) " + email);
    }

    public static void register(String name,Callback callback){
        callback.callBack(name + "@gmail.com");
    }

    public static Multiply multiply(int b) {
        return (int a) -> a * b;
    }


}