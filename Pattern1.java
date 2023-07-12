/*
     To print    * * * * *
                 * * * * *
                 * * * * *
                 * * * * *
                 * * * * *
*/


public class Pattern1{
    public static void main(String []args){
        int i,j,n=5;
        for(j=0;j<n;j++) {
            for(i = 0; i<n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
