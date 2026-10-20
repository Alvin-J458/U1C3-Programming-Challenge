public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    private String calcModel;
    private int idNumber;

    public Solution(String model, int id) {
        calcModel=model;
        idNumber=id;
    }

    public Solution(int id) {
        idNumber=id;
        calcModel="TI-84";
    }

    public String getCalcModel() {
    
        return "TI-84";
    }

    public void setCalcModel(String newModel) {
     calcModel=newModel;
    }

    public int getIdNumber() {
        //implement code here
        return idNumber;
    }

    public void setIdNumber(int newId) {
    idNumber   =newId;
    }

    public void incrementId() {
        idNumber=idNumber++;
    }

    public double add(double num1, double num2) {
        
        return num1+num2;
    }

    public double subtract(double num1, double num2) {
        //implement code here
        return num1-num2;
    }

    public double multiply(double num1, double num2) {
        //implement code here
        return num1*num2;
    }

    public int quotient(int num1, int num2) {
        //implement code here
        return num1/num2;
    }

    public int remainder(int num1, int num2) {
        //implement code here
        return num1%num2;
    }

    public String divisionResult(int num1, int num2) {
       int R = num1/num2;
       int p = num1%num2;
    return R + " R " + p;
       
        
    }

    public String coordinatePair(int x, int y) {
        //implement code here
     return "";
    }

    public int average(int num1, int num2) {
       double z = num1+num2; 
       double b = (z/2)+0.5;
    int m =  (int)b;
        return m;
    }

    public String info() {
        //implement code here
 return "This calculator is a model " + calcModel + " with id " + idNumber;
    }

}
