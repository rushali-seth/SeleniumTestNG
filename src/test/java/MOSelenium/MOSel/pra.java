package MOSelenium.MOSel;

public class pra {

    public static void max(int[] arr){

        for(int i=1;i<arr.length; i++){
            if(arr[i]>arr[0]){
                arr[0]=arr[i];
            }
        }

       System.out.println("largest element" + arr[0]);
        System.out.println("smallest" + arr[(arr.length-1)]);
    }




    public static void main(String[] args){
        int arr1[] = {453, 3,3,5,62,456,6};
        max(arr1);



    }
}
