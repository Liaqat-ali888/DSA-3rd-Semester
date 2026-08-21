class MyArray {
    private int[] array;
    private int size;
    private int count;

    public MyArray(int capacity) {
        array = new int[capacity];
        int size = 0;
        int count = -1;
    }

    public void insert(int index, int value) {
        array[index] = value;
        size++;
    }

    public void insertAfter(int afterValue, int value) {
        for (int i = 0; i < size; i++) {
            if (afterValue == array[i]) {
                count++;
                size++;
            }
        }
        for (int i = size; i > count; i--) {
            array[i] = array[i - 1];
        }
        array[count] = value;

    }

    public void updateByValue(int oldValue, int newValue) {

       for(int i =0; i<size; i++){
        if(oldValue == array[i]){
            array[i]= newValue;
        }

       }
    }
    public void deleteByValue(int value){
        int dcount =-1;
        for(int i =0; i<size; i++){
            if(array[i] == value){
                dcount=i;
        }
    }
        for (int i = dcount; i < size-1; i++){
            array[i]=array[i+1];


        }
        size--;


    }
    public int search(int value){
        for (int i = 0; i < size; i++) {
            if(array[i] == value){
                return i;
            }

        }
        return -1;
    }
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}
class Main{
    public static void main(String arg[]){
        MyArray myArray = new MyArray(10);
        myArray.insert(0,10);
        myArray.insert(1,20);
        myArray.insert(2,30);
        myArray.display();
        myArray.insertAfter(20,25);
        System.out.println("\n\n");
        myArray.display();
        myArray.updateByValue(30,350);
        System.out.println("\n\n");
        myArray.display();
        myArray.deleteByValue(20);
        System.out.println("\n\n");
        myArray.display();

       ;
        System.out.println("\n"+ myArray.search(350));



    }
}