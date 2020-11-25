
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        
        
        int[][] matrix = new int[size][size];
        int matrixLeft = 0;
        int matrixRight = 0;
        int matrixFill = 1;
        matrixRight = size/2;
        matrix[matrixLeft][matrixRight] = matrixFill;
        int boxNum = (size*size)-1;
        
        for(int i=0; i<boxNum; i++){
            
        int matrixLeftHolder = matrixLeft;
        int matrixRightHolder = matrixRight;
        matrixFill = matrixFill+1;
        matrixLeft = matrixLeft-1;
        matrixRight = matrixRight+1;
        
        if (matrixLeft<0){
            matrixLeft = size-1;
        }
        
        if (matrixRight>size-1){
            matrixRight = 0;
        }
        
        if (!(matrix[matrixLeft][matrixRight]==0)){
            matrixLeftHolder=matrixLeftHolder+1;
            if (matrixLeftHolder>size-1){
                matrixLeftHolder=0;
            }
            matrix[matrixLeftHolder][matrixRightHolder]= matrixFill;
            matrixLeft = matrixLeftHolder;
            matrixRight = matrixRightHolder;
            continue;
        }
        
        matrix[matrixLeft][matrixRight] = matrixFill;
        
        }
        
        // implement the creation of a magic square with the Siamese method algorithm here
        
        MagicSquare square = new MagicSquare(matrix);
        return square;
    }
    

}
