public class Vetores_Matrix {

    public static void main(String[]args){

        double[][] x = new double[3][3];

        x[0][0]=10;
        x[0][1]=10;
        x[0][2]=10;
        x[1][0]=10;
        x[1][1]=10;
        x[1][2]=10;
        x[2][0]=10;
        x[2][1]=10;
        x[2][2]=10;

        for(int i=0;i< x.length;i++){
            for(int j=0; j<x[i].length;j++){
                System.out.print(i + "|" + j + " = " + x[i][j] + "\t");


            }
            System.out.println("\n");
        }

    }
}
