public class Multiplication {
    public static void multiplication(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        multiplication(12);
    }
}
