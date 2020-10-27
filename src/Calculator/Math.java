package Calculator;

import static java.lang.Math.*;

public class Math {
	
	public static enum OPERATOR { NOOP, PLUS, MINUS, DIVIDE, MULTIPLY, POWER, SIN, COS, TAN, MOD};
	public static double calculateIt(double arg1, OPERATOR mathOp, double arg2) {
		
		double calcAnswer;		
		switch(mathOp)
	    {
	        case PLUS:
	            calcAnswer = arg1 + arg2;
	            break;
	        case MINUS:
	            calcAnswer = arg1 - arg2;
	            break;
	        case DIVIDE:
	            calcAnswer = arg1 / arg2;
	            break;
	        case MULTIPLY:
	            calcAnswer = arg1 * arg2;
	            break;
			case POWER:
				calcAnswer = pow(arg1, arg2);
				break;
			case MOD:
				calcAnswer = arg1 % arg2;
				break;
			case SIN:
				calcAnswer = sin(arg1);
				break;
			case COS:
				calcAnswer = cos(arg1);
				break;
			case TAN:
				calcAnswer = tan(arg1);
				break;
	        case NOOP:
	        default:	
	            calcAnswer = arg1;
	    }
		return calcAnswer;
	}
	

}
