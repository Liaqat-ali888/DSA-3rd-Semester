class rowmagic{
    public static void main(String[] arg){

        int array[][] = {{1,2,3},
                {1,2,3},
                {1,2,3},
                {1,2,3}};
        int rowsize = array.length;
        int colsize = array[0].length;
        int firstsum =0;
        for(int i =0; i<colsize ; i++){
            firstsum = firstsum + array[0][i];

        }
        boolean magic = true;
        for(int i =0;i<rowsize ;i++){
            int sum =0;
            for(int j=0; j<colsize ; j++){
                sum = sum + array[i][j];
            }
            if(sum!= firstsum){
                magic = false;
                break;
            }

        }
        if(magic)
        {
            System.out.println("the array is row magic ");

        }
        else{
            System.out.println("the array is not row magic");
        }
    }
}