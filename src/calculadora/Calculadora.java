package calculadora;
/**
 * 
 * 
 * @author Andreu
 * @version 1.0
 *
 */
public class Calculadora {
	/**
	 * variables holis
	 * 
	 */
    private int num1;
    private int num2;
    
    public Calculadora(int a, int b){
        num1 = a;
        num2 = b;
    }
    /**
     * suma de las variables
     */
    public int suma(){
        int resul = num1 + num2;
        return resul;
    }
    /**
     * resta de las variables
     */
    public int resta(){
        int resul;
        if(resta2()) {
        	resul = num1 - num2;
        }else {
        	resul=num2- num1;
        }
        return resul;
    }
    /**
     * resta de las variables pero tipo boolean
     */
    public boolean resta2() {
    	if(num1 >=num2) return true;
    	else return false;
    }
    /**
     * division de las variablestipo integer
     * 
     */
    public Integer divide2() {
    	if(num2==0) return null;
    	
    	int resul =num1/num2;
    	return resul;
    }
    /**
     * multipicacion de las variables
     */
    
    
    public int multiplica(){
        int resul = num1 * num2;
        return resul;
    }
    /**
     * division de las variables
     */
    public int divide(){
        int resul = num1 / num2;
        return resul;
    }
}
