package Practice.Sample_Project_2.service;

import org.springframework.stereotype.Service;


import java.lang.reflect.Array;
import java.util.Objects;

@Service
public class SampleService {
    //generate?data=samPAth,haRIka,maNOhar => sampathHarikaManohar
    //generate?data=sampath,Harika,Manohar => sampathHarikaManohar
    public String generate(String data) {
        String[] data1 = data.split(",");
        StringBuilder builder = new StringBuilder();
        String d = data1[0].toLowerCase();
        builder.append(d);
        for(int i = 1; i < data1.length; i++){
           String dd = data1[i].toLowerCase();
           builder.append(String.valueOf(dd.charAt(0)).toUpperCase());
           builder.append(dd.substring(1));
        }
        return builder.toString();
    }

    //countTrue?data=true,false,true,true,false,true =>4
    public int count(String data) {
        String[] data1 = data.split(",");
        int count = 0;
        for(int i = 0; i < data1.length; i++){
            if(data1[i].equals("true")){
                ++count;
            }
        }
        return count;
    }

    //wordCount?data=A man standing at pole is handsome => 7
    public int wordCountOfString(String data) {
        String[] data1 = data.split(" ");
        return data1.length;

    }

    //checkEnding?data=Wilmington&end=ton => true
    public boolean compareStringEnding(String data1, String data2) {
        String s = "";
        if(data2.length() > data1.length())
        {
            return false;
        }
        else
        {
            int len1 = data1.length();
            int len2 = data2.length();
            for(int i = len1-len2; i < len1; i++){
                s += data1.charAt(i);
            }
            if(data2.contentEquals(s))
            {
                return true;
            }
            else{
                return false;
            }

        }
    }

    //calculator?a=3&c=*&b=8 => 24
    public int checkCalculator(int a, char c, int b){
        if(c == '+')
        {
            return a + b;
        }
        else if(c == '-') {
            return a - b;
        }
        else if(c == '*') {
            return a * b;
        }
        else{
            return a / b;
        }
    }

    //existsHigher?str=1,4,2,6,8&b=2 => true
    public boolean checkArrayHigher(String str, int b){
        boolean flag = false;
        String[] a = str.split(",");
        for(int i = 0; i < a.length; i++){
            if(Integer.parseInt(a[i])>b){
                flag = true;
            }
        }

        return flag;
    }


    public String stringShuffle(String data){
        String[] data1 = data.split(" ");
        String s = "";
        for(int i = data1.length-1; i >= 0; i--){
            if(i != 0)
            {
                s += data1[i]+" ";

            }
            else if(i == 0){
                s += data1[i];
                break;
            }
        }
        return s;
    }


    public float dicountValue(float a, float b){
        float c = 100-b;

        float d = (a * c)/100;

        return d;
    }

    public float calculator(float a, float b, char c){
        float d = 0;
        if(c == '+')
            d = a + b;

        else if(c == '-')
            d = a - b;

        else if(c == '*')
            d = a * b;

        else if(c == '/')
            d =  a / b;

        else if(c == '%')
            d = a % b;
        else
            return 0;

        return d;
    }



    public String stutterService(String data){
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<2; i++){
            builder.append(data.substring(0,2));
            builder.append("...");
        }
        builder.append(data);
        builder.append("?");

        return builder.toString();


    }



    public String fizzBuzzService(int a){
        if(a%3==0 && a%5==0){
            return "FizzBuzz";
        }
        else if(a%5==0){
            return "Buzz";
        }
        else if(a%3==0){
            return "Fizz";
        }
        else{
            return Integer.toString(a);
        }

    }





    public int equals(int a, int b, int c){
        if(a==b && a==c){
            return 3;
        }
        else if(a==b || a==c || b==c){
            return 2;
        }
        else{
            return 0;
        }
    }


    public String reverse(String data){
        int len = data.length();
        StringBuilder sb = new StringBuilder(len);
        for(int i=len-1; i>=0; i--){
            sb.append(data.charAt(i));
        }
        return sb.toString();
    }


    public String getWordSum(String data1, String data2){
        StringBuilder builder = new StringBuilder();
        int len1 = data1.length();
        builder.append(String.valueOf(data1.charAt(0)).toUpperCase());
        builder.append(data1.substring(1,len1));
        builder.append(data2);
        return builder.toString();
    }


}
