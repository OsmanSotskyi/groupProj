package HomeWorkGroupProj;

public class task9 {
    public static void main(String[] args) {
        int [] numbers ={20,32,78,123,45,678,90};
        int max=0;
        int sMax=0;


        for (int num:numbers){
            if (num>max){
                sMax=max;
                max=num;
            } else if (num>sMax) {
                sMax=num;

            }
        }
        System.out.println(sMax);
    }
}
