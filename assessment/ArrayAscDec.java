package assessment;
import java.util.Scanner;

public class ArrayAscDec {
    public static void main(String[] args) {
        ArrayAscDec arrayAsDs= new ArrayAscDec();
        arrayAsDs.ascendingDecending();
    }
    private void ascendingDecending(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements of an array");
        for(int i =0;i<length;i++)
            arr[i]=sc.nextInt();
        int[] oddArr = new int[length/2+1];
        int[] evenArr = new int[length/2];
        for(int i=0;i<length;i++){
            if(i==0)
                oddArr[0]=arr[i];
            else if (i==1) {
                evenArr[0]=arr[i];
            }
            else if(i%2==0)
                oddArr[i/2]=arr[i];
            else evenArr[i/2]=arr[i];
        }
        for(int i=1;i<length/2+1;i++){
            int j=i;
            int a=oddArr[i];
            while((j>0)&&oddArr[j-1]>a){
                oddArr[j]=oddArr[j-1];
                j--;
            }
            oddArr[j]=a;
        }
        for(int i=1;i<length/2-1;i++){
            int j=i;
            int a=evenArr[i];
            while((j>0)&&evenArr[j-1]>a){
                evenArr[j]=evenArr[j-1];
                j--;
            }
            evenArr[j]=a;
        }
        /*for(int i=0;i<length/2+1;i++)
            System.out.println(oddArr[i]);*/
        for(int i=0;i<length/2+1;i++){
            System.out.print(oddArr[i]);
            try {
                System.out.print(evenArr[length / 2 - i - 1]);
            }catch (ArrayIndexOutOfBoundsException e){

            }
        }
        /*int[] tempOdd = new int[length/2+1];
        int[] tempEven = new int[length/2];
        for(int i=0;i<length/2+1;i++){
            for(int j=i+1;j<length/2+1;j++){
                if(oddArr[i]<oddArr[j]){
                    tempOdd[i]=oddArr[i];
                }
            }
        }*/


//        Arrays.sort(oddArr); Arrays.sort(evenArr);
        /*for(int i=0;i<length/2+1;i++){
            System.out.println(tempOdd[i]);
            try {
                System.out.println(tempEven[length / 2 - i - 1]);
            }catch (ArrayIndexOutOfBoundsException e){

            }
        }*/
    }
}
