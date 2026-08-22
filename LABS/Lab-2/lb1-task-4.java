class Main {
    public static void main(String[] args) {

        int[] array = {16, 9, 17, 3, 9, 15, 21, 16, 8, 6};

        System.out.print("Original array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int[] newArray = new int[array.length];
        int size = 0;

        for (int i = 0; i < array.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < size; j++) {
                if (array[i] == newArray[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                newArray[size] = array[i];
                size++;
            }
        }

        System.out.println();

        System.out.print("Array  removing duplicates is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(newArray[i] + " ");
        }

        System.out.println();
        System.out.println(" original array size: " + array.length);
        System.out.println(" new array is: " + size);
    }
}