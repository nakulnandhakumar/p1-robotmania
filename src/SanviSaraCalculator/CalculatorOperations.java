//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package SanviSaraCalculator;

public class CalculatorOperations {
    private int arg1;
    private int arg2;
    private int op;

    public CalculatorOperations(int arg1, int op) {
        this.arg1 = arg1;
        this.op = op;
    }

    public CalculatorOperations(int arg1, int arg2, int op) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.op = op;
    }
    public double getResult() {
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
                answer = (double)arg1 / arg2;
                break;
            case (5):
                answer = arg1 % arg2;
                break;
            case (6):
                answer = arg1 * arg1;
                break;
            case (7):
                answer = java.lang.Math.sqrt(arg1);
                break;
            case (8):
                answer = java.lang.Math.sin(arg1);
                break;
            case (9):
                answer = java.lang.Math.cos(arg1);
                break;
            case (10):
                answer = java.lang.Math.tan(arg1);
                break;
            case (11):
                answer = 1/ java.lang.Math.tan(arg1);
                break;
            case (12):
                answer = 1/ java.lang.Math.sin(arg1);
                break;
            case (13):
                answer = 1/ java.lang.Math.cos(arg1);
                break;
            default:
                answer = arg1;
            }
            return answer;
        }
    }


