import java.util.Scanner;
class reverse{
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter values: ");
        for (int i =0;i<size;i++){
            array[i] = input.nextInt();
        }
        int size1 = size;
        
        int[] array1 = new int[size];
        for(int i=0; i<size;i++){
            --size1;
            array1[size1] = array[i];

        }
        System.out.print("first array: ");
        for(int i =0; i<size ;i++){
            System.out.print(array[i]+",");
        }
        System.out.print("\n"+"reverse array: ");
        for(int i =0; i<size ;i++){
            System.out.print(array1[i]+",");
        }
    }
}