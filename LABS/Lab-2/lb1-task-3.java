import java.util.Scanner;
class reverse {
    public static void main(String arg[]) {
        int count = 0;

        int[] array = {2, 5, 7, 3, 4, 7, 2, 4, 7};
        int size = array.length;
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i != size - 1) {
                System.out.print(",");
            }

        }
        for (int i = 0; i < size; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (duplicate) {
                continue;
            }


            for (int k = i + 1; k < size; k++) {
                if (array[i] == array[k]) {
                    count++;
                    break;
                }
            }
        }

            System.out.print("\n The count of duplicate values is: " + count);
        }

    }
