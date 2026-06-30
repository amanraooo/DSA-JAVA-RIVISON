public class ContainerWithMostWater{
    public static void main(String[] args) {
       int height[] = {1,8,6,2,5,4,8,3,7};

       System.out.println(maxArea(height));
    }
    public static int maxArea(int arr[]){
        int l=0;
        int r = arr.length-1;
        int max =0;

        while (l<r) {
            int w = r - l;
            int h = Math.min(arr[l], arr[r]);
            int area = w*h;
            max = Math.max(max, area);

            if(arr[l]<arr[r])l++;
            else if(arr[l]>arr[r]) r--;
            else{
                l++; r--;
            }
        }
        return max;
    }
}