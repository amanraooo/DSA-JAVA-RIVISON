public class EvenOrOdd {
    public static void main(String[] args) {
        find(3);
    }
    public static void find(int num){
        
        while(num>2){
         num= num-2;
        }
        if(num==1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
        
    }
}
