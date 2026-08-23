class rowmagic{
    public static void main(String[] arg){

        int array[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};

        int rowsize = array.length;
        int colsize = array[0].length;
        System.out.println("Original array values are:");
        for(int i=0;i<rowsize;i++){
            for(int j=0; j<colsize;j++)
            {
                System.out.print(array[i][j]+"  ");

            }
            System.out.print("\n");
        }
        System.out.println("Horizontally flipped array is:");
        for (int i= rowsize-1;i>=0;i--){
            for(int j =0;j<colsize;j++){
                System.out.print(array[i][j]+"  ");
            }
            System.out.print("\n");
        }


    }

}