package edu.dmacc.codedsm.hw7;

public class SumHundred {
    public static void main(String[] args) {

        int result = 0;
        int count = 0;
        while(result <100){

            result = sumhendredIntegers(2,6,result);

            count ++;

        }
        output(result, count);


    }
    public static int sumhendredIntegers(int firstInput, int secondInput, int priorResuslt) {
        return firstInput + secondInput + priorResuslt;

    }

       public static void output(int finalResult, int iterations){
            System.out.println("The first result greater than 100 was " + finalResult + "and took " + iterations +"  to complete");
        }
    }



