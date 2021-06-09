public class Last {
    public static void main(String[] args) {
        for (int contador=1;contador<=100;contador++){
            if (contador%3!=0&&contador%5!=0){
                System.out.println(contador);
            }
            if (contador % 3 == 0){
                System.out.println("Fizz");
            }
            if (contador%5==0){
                System.out.println("Buzz");
            }
            if (contador % 3==0 &&contador%5==0){
                System.out.println("FizzBuzz");
            }
        }
    }
}
