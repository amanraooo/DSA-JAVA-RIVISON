public class SecondLargest{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        System.out.println(secLarge(arr));

        int arr1[]={12,35,1,10,34,1};
        System.out.println(secLarge(arr1));

        int arr2[]={3,8,1,6,2};
        System.out.println(secLarge(arr2));
    }

    public static int secLarge(int arr[] ){
        int l =arr[0];
        int sl =Integer.MIN_VALUE;

        for(int i =1 ; i < arr.length; i++){
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }
            else if(arr[i]>sl && arr[i]!=l){
                sl=arr[i];
            }
        }

        return sl;
    }
}