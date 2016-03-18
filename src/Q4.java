
public class Q4 {

    
    
    public static void main(String args[]){
        int n = 12;
        
        int i = 1;
        int j = 3;
        while (i != n){
            j = 2 * j + i - 1;
            i = i + 1;
            System.out.print("" + j +",");
        }
        
    }
}
