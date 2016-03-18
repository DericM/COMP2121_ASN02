public class Q2 {

    public static void main(String args[]){
        int n = 50;
        int time = 1000;
        for(int i = 1; i <= n ;i++){
            time = time + 10;
            for(int k = 1; k <= i ;k++){
                time = time + 24 * k;
            }
        }
        System.out.println(time);
    }
    
}
