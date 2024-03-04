package pro.sky.colculatorArtifact;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

     public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
     }
    @GetMapping(path = "/calculator")
    public String hello() {
        return calculatorService.hello();
    }
    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam("numb1") int numb1, @RequestParam("numb2") int numb2) {
        return calculatorService.plus(numb1, numb2);
    }
    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam("numb1") int numb1, @RequestParam("numb2") int numb2) {
        return calculatorService.minus(numb1, numb2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("numb1") int numb1, @RequestParam("numb2") int numb2) {
        return calculatorService.multiply(numb1, numb2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("numb1") int numb1, @RequestParam("numb2") int numb2) {
        return calculatorService.divide(numb1, numb2);
    }
}
