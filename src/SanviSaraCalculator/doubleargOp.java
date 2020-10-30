package SanviSaraCalculator;

public class doubleargOp {


    public double doubleargOp(int arg1, int op, int arg2) {
        double answer;
        switch (op) {
            case (1):
                answer = arg1 + arg2;
                break;
            case (2):
                answer = arg1 - arg2;
                break;
            case (3):
                answer = arg1 * arg2;
                break;
            case (4):
                answer = arg1 / arg2;
                break;
            case (5):
                answer = arg1 % arg2;
                break;
            default:
                answer = arg1;


        }
        return answer;
    }
}
