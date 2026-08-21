import java.util.Scanner;
class reverse{
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of first array: ");
        int size = input.nextInt();
        int[] array = new int[size];

        for (int i =0;i<size;i++){
            System.out.print("Enter value "+(i+1)+": ");
            array[i] = input.nextInt();
        }
        System.out.print("Enter the size of second array: ");
        int size1 = input.nextInt();
        int[] array1 = new int[size1];

        for (int i =0;i<size1;i++){
            System.out.print("Enter value "+(i+1)+": ");
            array1[i] = input.nextInt();
        }
        int size2 = size + size1;

        int[] array2 = new int[size2];
        for(int i=0;i<size;i++){
            array2[i] = array[i];
        }
        int j=0;
        for(int i = size; i < size2; i++){
            array2[i] = array1[j];
            j++;
        }


        System.out.println("The combined elements: ");
        for(int i = 0; i< size2; i++){
            System.out.print(array2[i]+",");
        }

    }
}