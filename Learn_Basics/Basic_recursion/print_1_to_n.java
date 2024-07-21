public class print_1_to_n {
    static void print(int curr,int n){
        if(curr>n){
            return;
        }
        System.out.println(curr);
        print(curr+1, n);
    }
    public static void main(String[] args) {
        int n=5;
        print(1,n);

    }

}