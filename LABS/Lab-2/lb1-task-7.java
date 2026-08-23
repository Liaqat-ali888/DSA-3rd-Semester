class colmagic{
    public static void main(String[] arg){

        int array[][] = {
                {1,3,3},
                {3,5,3},
                {4,0,2}};
        int rowsize = array.length;
        int colsize = array[0].length;
        int firstsum =0;
        for(int i =0; i<colsize ; i++){
            firstsum = firstsum + array[i][0];

        }
        boolean magic = true;
        for(int i=0;i<rowsize ;i++){
            int sum =0;
            for(int j=0; j<colsize ; j++){
                sum = sum + array[j][i];
            }
            if(sum!= firstsum){
                magic = false;
                break;
            }

        }
        if(magic)
        {
            System.out.println("the array is col magic ");

        }
        else{
            System.out.println("the array is not row magic");
        }
    }
}
