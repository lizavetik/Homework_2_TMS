public class Task_3 {
    public static void main(String[] args){

        //посчитать сумму степеней двойки до восьмой включительно
        int summ3= 0;
        for(double i = 0; i<8; i++){
            double b = 2;
            summ3 += Math.pow(b, i+1);
            System.out.println("" + summ3 + " ");
        }
        System.out.println("Summ of degrees of 2 (from 0 to 8) is equal to " + summ3);

    }
}
