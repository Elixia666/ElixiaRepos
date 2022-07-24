public class PracaDomowa3 {
    public static void main(String[] args) {
        int[] tab1 = new int[100];
        int j = 0;

        for (int i=1;i<=100;i++){
           if((i%3) == 0){
               tab1[j] = i;

               System.out.print(tab1[j]+",");
               j++;

           }
        }

        System.out.println();
        int[] tab2 = new int[j];
        for(int k = 0;k <=j-1 ; k++){
            tab2[k] = tab1[j-k-1];
            System.out.print(tab2[k]+",");
        }
    }
}
