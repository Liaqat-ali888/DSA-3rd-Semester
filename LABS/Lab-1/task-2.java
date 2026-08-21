class Main{
    public static void main(String arg[]){
        targetsum Target = new targetsum(4);
        Target.Array(0,2);
        Target.Array(1,3);
        Target.Array(2,25);
        Target.Array(3,7);
        Target.target(28);
        Target.display();
    }
}
class targetsum{
    private int[] nums;
    private int index1;
    private int index2;
    private int size;
    private int target;
    targetsum(int size){
        this.size = size;
        nums = new int[size];
        index1 =-1;
        index2=-1;

    }
    public void Array(int index, int value){
        nums[index] = value;
    }
    public void target(int target){
        this.target = target;
        for (int i=0; i<size; i++){
            for(int j=i+1;j<size;j++){

                if (nums[i]+nums[j]==target){
                    index1= i;
                    index2=j;
                    return;

                }
            }
        }
    }
    public void display(){
        System.out.print("nums=[");
        for(int i=0; i<size; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println("]");
        System.out.println("target="+target);
        System.out.println("Output:");

        System.out.println("[ "+index1+" , "+index2+"]");

    }
}