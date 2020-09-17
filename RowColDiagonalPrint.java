class RowColDiagonalPrint {
    int grid[][];

    public RowColDiagonalPrint() {
        grid[][] = {
            {1,2,3,4,5},
            {11,12,13,14,15},
            {21,22,23,24,25},
            {31,32,33,34,35},
            {21,22,23,24,25}
        };
    }

    //printing first column
//    public void printBorder(){
//        int size=5,i,j;
//        //int [][] a = new int[size][size];
//        int [][] a= { {1, 2,3} , { 4, 5,6},{7,8,9} };
//        for(i=0;i<=size-1;i++)
//        {
//            System.out.println(a[i][0] + " ");
//        }
//    }

    //printing last row
    public void printLastRow() {
        int size = 5, i, j,f=0;
        int[][] grid = new int[size][size];
        for (i = 1; i <= size - 1; i++)
        {
            System.out.println(grid[size-1][i] + " ");
            f++;
        }
        System.out.println("no of times is "+f);
    }
    //printing last column
    public void printLastColumn() {
        int size = 5, i, j;
        int[][] grid = new int[size][size];
        for (i = size - 2; i > 0; i--) {
            System.out.println(grid[i][size - 1] + " ");
//            System.out.println("test");
        }
    }
    //printing first row
        public void printBorder4(){
            int size=5,i,j;
            int [][] grid = new int[size][size];
            for(i=size-2;i> 0;i--)
            {
                System.out.println(grid[size-1][i] + " ");
//                System.out.println("test");
            }

    }

   //printing second column second row
    public void printBorder12() {
        int size = 5, i, j;
        int[][] grid = new int[size][size];
        for (i = 1; i <= size - 2; i++)
        {
            System.out.println(grid[i][size-4] + " ");
        }
    }
    //printing 4th row 4th column
    public void printBorder21() {
        int size = 5, i, j;
        int[][] grid = new int[size][size];
        for (i = 1; i <= size - 2; i++)
        {
            System.out.println(grid[size-2][i] + " ");
        }
    }
//printing 3rd row and 3rd column
    public void printBorder31() {
        int size = 5, i, j;
        int[][] grid = new int[size][size];
        for (i = 3; i <= size - 4; i--)
        {
            System.out.println(grid[i][size-2]+ " ");
        }
    }
    //printing 2nd row 2nd column

    public void printBorder32() {
        int size = 5, i, j;
        int[][] grid = new int[size][size];
        for (i = size-2; i <= size - 3; i--)
        {
            System.out.println(grid[size-4][i]+ " ");
        }
    }
//printing middle elemnt
    public void printBorder22() {
        int size = 5, i, j;
        int[][] grid = new int[size][size];
        for (i = size-3; i <= size - 3; i++)
        {
            System.out.println(grid[size-3][size-3]+ " ");
        }
    }

    public static void main(String args[]) {
        System.out.println("Hello Java");
        int f=1;
        RowColDiagonalPrint rowColDiagonalPrint = new RowColDiagonalPrint();
        rowColDiagonalPrint.printMatrix();
//        rowColDiagonalPrint.printBorder();
        rowColDiagonalPrint.printLastRow();
        rowColDiagonalPrint.printLastColumn();
        rowColDiagonalPrint.printBorder4();
        rowColDiagonalPrint.printBorder12();
        rowColDiagonalPrint.printBorder21();
        rowColDiagonalPrint.printBorder31();
        rowColDiagonalPrint.printBorder32();
        rowColDiagonalPrint.printBorder22();
    }
}
