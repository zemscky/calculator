package skypro.homework.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import skypro.homework.calculator.service.CalcService;

@RestController
@RequestMapping("/calculator")
public class CalcController {

    @GetMapping()
    public String getGreetings(){
        return  "Добро пожаловать в калькулятор";
    }
    @GetMapping("/plus")
    public String plus(@RequestParam(name = "num1") Integer num1, @RequestParam(name = "num2") Integer num2){
        return num1 + " + " + num2 + " = " + CalcService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(name = "num1") Integer num1, @RequestParam(name = "num2") Integer num2){
        return num1 + " - " + num2 + " = " + CalcService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(name = "num1") Integer num1, @RequestParam(name = "num2") Integer num2){
        return num1 + " * " + num2 + " = " + CalcService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(name = "num1") Integer num1, @RequestParam(name = "num2") Integer num2){
        return num1 + " / " + num2 + " = " + CalcService.divide(num1, num2);
    }

}
