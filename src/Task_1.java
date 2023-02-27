public class Task_1 {
    public static void main(String[] args){

        //дз1 про спротсмена и тренировки цикл на 6 итераций в каждой прибавляется 10%
        double a = 10.0;
        for(int i = 0; i<7; i++){
            int i1 = i+1;
            System.out.println("On day" + i1 + " the athlete ran" + a);
            double b = a + 0.1 * a;
            a = b;
        }
    }
}
