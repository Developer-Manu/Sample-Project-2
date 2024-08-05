package Practice.Sample_Project_2.Controller;

import Practice.Sample_Project_2.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;


@RestController
public class EmployeeController {

    @Autowired
    SampleService sampleService;

    @GetMapping("/generate")
    public String generateEmployee(@RequestParam String data){
       return sampleService.generate(data);

    }

    @GetMapping("/countTrue")
    public int countTrue(@RequestParam String data){
        int a = sampleService.count(data);
        return a;
    }

    @GetMapping("/wordCount")
    public int wordCount(@RequestParam String data){
        int q = sampleService.wordCountOfString(data);
        return q;
    }

    @GetMapping("/checkEnding")
    public boolean checkEnding(@RequestParam String data, @RequestParam String end){
        boolean b = sampleService.compareStringEnding(data, end);
        return b;
    }

    @GetMapping("/calculator")
    public int calculator(@RequestParam int a, @RequestParam char c, @RequestParam int b){
        int n = sampleService.checkCalculator(a, c, b);
        return n;
    }


    @GetMapping("/existsHigher")
    public boolean existsHigher(@RequestParam String str, @RequestParam int b){
        boolean flag = sampleService.checkArrayHigher(str, b);
        return flag;
    }



    @GetMapping("/nameShuffle")
    public String nameShuffle(@RequestParam String data){
        String str = sampleService.stringShuffle(data);
        return str;
    }


    @GetMapping("/discount")
    public float discount(@RequestParam float a, @RequestParam float b){
        float dis = sampleService.dicountValue(a,b);
        return dis;
    }


    @GetMapping("/operate")
    public float operate(@RequestParam float a, @RequestParam float b, @RequestParam char c){
        float n = sampleService.calculator(a, b, c);
        return n;
    }


    @GetMapping("/stutter")
    public String stutter(@RequestParam String data){
        String str = sampleService.stutterService(data);
        return str;
    }

    @GetMapping("/fizzBuzz")
    public String fizzBuzz(@RequestParam int a){
        String s = sampleService.fizzBuzzService(a);
        return s;
    }






    @GetMapping("/equal")
    public int equal(@RequestParam int a,@RequestParam int b, @RequestParam int c){
        return sampleService.equals(a,b,c);
    }


    @GetMapping("/reverseString")
    public String reverseString(@RequestParam String str){
        return sampleService.reverse(str);
    }


    @GetMapping("/getWord")
    public String getWord(@RequestParam String str1, @RequestParam String str2){
        return  sampleService.getWordSum(str1, str2);
    }
}
