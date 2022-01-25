package accademy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        while(count !=5){
            System.out.println("Count value is " + count);
            count ++;
        }

        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count !=6);
    }
}
