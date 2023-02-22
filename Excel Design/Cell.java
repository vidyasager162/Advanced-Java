class Cell{
    String val;
    Calc calc;

    Cell(String val, Calc calc){
        this.val = val;
        this.calc = calc;
    }

    String getVal(){
        return this.val;
    }

    String calculate(){
        return val = calc.calculate(val);
    }
}