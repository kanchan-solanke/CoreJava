public class LepYear1 {
    public static void main(String[] args){
        int year = 2000;                        //Assume year = 2000;
        if(year%4 == 0){                 //divisible by 4
            if(year%100 == 0)           //divisible by 100
                if(year%400 == 0)      //divisible by 400
                    System.out.println("Leap Year");
                }
                else
                    System.out.println("Not a leap year");
            }
        }


