package SanviSaraCalculator;

import java.lang.Math;

public class singleArgOp {
    public double singleArgOp(int arg1, int op) {
        double answer2;
        switch (op) {
            case (6):
                answer2 = arg1 * arg1;
                break;
            case (7):
                answer2 = Math.sqrt(arg1);
                break;
            case (8):
                answer2 = Math.sin(arg1);
                break;
            case (9):
                answer2 = Math.cos(arg1);
                break;
            case (10):
                answer2 = Math.tan(arg1);
                break;
            case (11):
                answer2 = Math.acos(arg1);
                break;
            case (12):
                answer2 = Math.asin(arg1);
                break;
            case (13):
                answer2 = Math.atan(arg1);
                break;
            default:
                answer2 = arg1;
        }
        return answer2;
    }
}
