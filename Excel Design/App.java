class App{
    Worksheet worksheet;

    Excel(int n){
        this.worksheet = new Worksheet(n);
    }

    public static void main(String [] args){
        Calc calc = new  Calc(new Operation()); //Not implemented class Operation yet.
        Excel excel = new Excel(1);
        Worksheet newWorkSheet = excel.createWorksheet(100, 100);
        newWorkSheet.dispWorksheet();
    }
}