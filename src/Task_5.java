public class Task_5 {
    public static void main(String[] args){
//задание 5: программа для печати таблицы перевода дюймов в сантиметры от 1 до 20 где 1 дюйм - 2.54 см
        for (int i = 0; i<20; i++){
            int inches = i+1;
            double centimeters = inches * 2.54;
            System.out.println(inches + " inches are equal to " + centimeters +" centimeters ");

        }
    }
}
