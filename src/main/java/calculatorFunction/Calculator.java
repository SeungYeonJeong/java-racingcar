package calculatorFunction;

public class Calculator {
    public static void execute(){
        System.out.println("수식을 입력하시오: ");
        String str = GetInput.inputString();
        str = str.replace(" ", "");
        if(str.length()==0)
            throw new IllegalArgumentException("Error: need right expression");
        String[] stringArray = GetInput.parsing(str);
        Calculator calculator = new Calculator();
        calculator.calculate(stringArray);
        return;
    }
    public void calculate(String[] stringArray){

        for(int i=0; i< (stringArray.length-1)/2; i++){
            if (stringArray[0].equals("ERROR")) {
                System.out.println("ERROR");
                System.out.println("종료합니다.");
                return;
            }
            if (stringArray[i*2+1]==null) {
                System.out.println("정답: "+Integer.parseInt(stringArray[i * 2]));
                return ;    //정수로 바꿔서 리턴
            }
            parseOperation(stringArray,i*2);
        }
        return ;
    }

    public void parseOperation(String[] stringArray, int start){
        int firstOperand, secondOperand;

        if (stringArray[start].equals("ERROR") || stringArray[start + 2].equals("ERROR")) {
            stringArray[0] = "ERROR";
            return;
        }

        String operator=stringArray[start+1];
        firstOperand=Integer.parseInt(stringArray[start]);
        secondOperand=Integer.parseInt(stringArray[start+2]);

        int result=0;
        if(operator.equals("+")){
            result=add(firstOperand,secondOperand);
        }
        else if(operator.equals("-")){
            result=sub(firstOperand,secondOperand);
        }
        else if(operator.equals("*")){
            result=mul(firstOperand,secondOperand);
        }
        else if(operator.equals("/")){
            if(secondOperand==0) {
                stringArray[0] = "ERROR";
            }
            else
                result=div(firstOperand,secondOperand);
        }
        else
            throw new IllegalArgumentException("Error: need right operator");

        stringArray[start+2]=String.valueOf(result);

        return;
    }

    public int add(int firstOperand, int secondOperand) {

        return firstOperand + secondOperand;
    }
    public int sub(int firstOperand, int secondOperand){

        return firstOperand - secondOperand;
    }
    public int mul(int firstOperand, int secondOperand) {

        return firstOperand * secondOperand;
    }
    public int div(int firstOperand, int secondOperand) {

        return firstOperand / secondOperand;
    }
}
