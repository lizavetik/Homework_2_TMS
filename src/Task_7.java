public class Task_7 {
    public static void main(String[] args){

//задание 7: сумма нечётных от 1 до 99
        int summ7 = 0;
        for(int j=1; j<100; j+=2){
            summ7 +=j;
        }
        System.out.println("Summ of odd numbers from 1 to 99 is " + summ7);

    }
}
