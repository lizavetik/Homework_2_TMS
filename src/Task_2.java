public class Task_2 {
    public static void main(String[] args){

//одноклеточная амёба делитмя каждые 3 часа, сколько их будет через 3,5,9...24 часа
        int amebaCount = 1;
        for(int i=0; i<25; i+=3){
            System.out.println("In " + i + " hours " + amebaCount + " amebas ");
            amebaCount *= 2;
        }
    }
}
