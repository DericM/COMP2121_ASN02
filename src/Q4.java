public class Q4 {

    public static void main(String args[]){
        int n = 20;
        
        int i = 1;
        int j = 3;
        while (i != n){
            System.out.print(j +",");
            j = 2 * j - i + 1;
            i = i + 1;
            
        }
        
    }
}
