package pro.sky.colculatorArtifact;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    public String plus(int firstNumb, int secondNumb) {
        int sum = firstNumb + secondNumb;
        return firstNumb + " + " + secondNumb + " = " + sum;
    }

    public String minus(int firstNumb, int secondNumb) {
        int sum = firstNumb - secondNumb;
        return firstNumb + " - " + secondNumb + " = " + sum;
    }

    public String multiply(int firstNumb, int secondNumb) {
        int sum = firstNumb * secondNumb;
        return firstNumb + " * " + secondNumb + " = " + sum;
    }

    public String divide(int firstNumb, int secondNumb) {
        if (secondNumb != 0) {
            int sum = firstNumb / secondNumb;
            return firstNumb + " / " + secondNumb + " = " + sum;
        }
        else {
            return "На ноль делить нельзя!";
        }
    }
}
