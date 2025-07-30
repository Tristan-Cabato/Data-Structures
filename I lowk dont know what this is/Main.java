public class Main {
    public static void fizzBuzz(int x) {
        System.out.printf("%d is ", x);
        System.out.println(x % 2 == 0 ? "Fizz" : "Buzz");
    }
    public static void main(String[] args) {
        fizzBuzz(5); 
        fizzBuzz(12); 
        fizzBuzz(25); 
        fizzBuzz(32); 
        fizzBuzz(45); 
    }
}
