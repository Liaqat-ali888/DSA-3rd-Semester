class Main{
    public static void main(String arg[]){
        Rotate rotate = new Rotate(4);
        rotate.Array(0,2);
        rotate.Array(1,3);
        rotate.Array(2,25);
        rotate.Array(3,7);
        rotate.display();
        rotate.ro(2);
        rotate.display();
    }
}
class Rotate{
    private int[] nums;
    private int size;
    private int number;
    Rotate(int size){
        this.size = size;
        nums = new int[size];
    }
    public void Array(int index, int value){
        nums[index] = value;
    }
    public void ro(int number){
        this.number = number;
        number= number % size;
        for(int i = 0; i < number; i++){
            int last = nums[size - 1];
            for(int j = size-1; j >0;j--){
                nums[j] = nums[j-1];
            }
            nums[0] = last;
        }

    }
    public void display() {
        System.out.println("number=" + number);
        System.out.print("nums=[");
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");

//        for(int i = 0; i < size; i++){
//            System.out.print(nums[i] + " ");
//        }

    }}