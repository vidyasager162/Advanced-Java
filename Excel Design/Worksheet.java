class Worksheet{
    int rows = 0, columns = 0, i = 0, j = 0;
    Cell matrix[][];

    Worksheet(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.matrix = new Cell[rows][columns];
    }

    Worksheet createWorksheet(int row, int columns){
        return new Worksheet(rows, columns);
    }

    void dispWorksheet(){
        for(i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                return matrix[i][j];
            }
        }
    }
}