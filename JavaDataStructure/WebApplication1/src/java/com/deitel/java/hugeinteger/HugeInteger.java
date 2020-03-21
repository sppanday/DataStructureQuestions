package com.deitel.java.hugeinteger;

import static com.sun.el.lang.ELArithmetic.subtract;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


/**
 *
 * @author surendrapanday
 */
@WebService(//annotatates the class as a web service
        name = "HugeInteger", //sets the service endpoint interface name
        serviceName = "HugeIntegerService")//sets the servie name
public class HugeInteger {

    private final static int MAXIMUM = 100;
    public int[] number = new int[MAXIMUM];

    //returns string representation of a HugeInteger
    public String toString() {
        String value = "";
        //convert hugeInteger to String
        for (int digit : number) {
            value = digit + value; //places next digit at beginning of value
        }        //locate position of first nonzero digit
        int length = value.length();
        int position = -1;
        for (int i = 0; i < length; i++) {
            if (value.charAt(i) != '0') {
                position = i; //first nonzero digit
                break;
            }
        }// end for
        return (position != -1 ? value.substring(position) : "0");
    }//end method substring
    //create huge integer from a string

    public static HugeInteger parseHugeInteger(String s) {
        HugeInteger temp = new HugeInteger();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            temp.number[i] = s.charAt(size - i - 1) - '0';
        }
        return temp;
    }// end method parseHugeInteger
    //WebMethod that adds huge integers represented by String arguements

    @WebMethod(operationName = "add")
    public String add(@WebParam(name = "first") String first, @WebParam(name = "second") String second) {
        int carry = 0;//the value to be carried
        HugeInteger operand1 = HugeInteger.parseHugeInteger(first);
        HugeInteger operand2 = HugeInteger.parseHugeInteger(second);
        HugeInteger result = new HugeInteger(); //stores difference
        //subtract bottom digit from top digit
        for (int i = 0; i < MAXIMUM; i++) {
            //if the digit in operand1 is smaller than corresponding 
            //digit in operand2, borrow from the next digit
            if (operand1.number[i] < operand2.number[i]) {
                operand1.borrow(i);
            }
            //subtract digits
            result.number[i] = operand1.number[i] - operand2.number[i];

        }//end for
        return result.toString();

    }//end WebMethodSubtract
    //borrow 1 from next digit
    private void borrow(int place){
        if(place >=MAXIMUM)
            throw new IndexOutOfBoundsException();
        else if(number[place+1]==0)//if next digit is zero
            borrow(place+1); //borrow from next digit
        number[place] += 10; // add 10 to borrowing digit
        --number[place+1];
        
    }//end borrow method
    //WebMethod that returns true if first integer is greater than second
    @WebMethod(operationName = "bigger")
    public boolean bigger(@WebParam(name = "first") String first, @WebParam(name="second") String second){
        try //try subtracting first from second
        {
            Number difference = subtract(first, second);
            return !difference.equals("^[0]+$");
        }// end try
        catch(IndexOutOfBoundsException e){//first is less than second
            return false;
        }//end catch 
    }//end WebMethod bigger
    
    @WebMethod(operationName = "smaller")
    public boolean smaller(@WebParam(name = "first") String first, 
            @WebParam(name = "second") String second){
        return bigger(second, first);
    }//end WebMethod smaller
    //WebMethod that returns true if the first integer is less than second
    @WebMethod(operationName = "eauals")
    public boolean equals(@WebParam(name= "first") String first,
            @WebParam(name="second") String second){
    
    return !(bigger(first, second)||smaller(first, second));
}//end WebMethod equals
}//end class HugeInteger
