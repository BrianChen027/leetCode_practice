# 273. Integer to English Words

#### Convert a non-negative integer num to its English words representation.

##### Example 1:
##### Input: num = 123
##### Output: "One Hundred Twenty Three"

VERSION 2
```
class Solution {   
    public String[] underTwenty = {"","One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine ","Ten ","Eleven ","Twelve ","Thirteen ","Fourteen ","Fifteen ","Sixteen ","Seventeen ","Eighteen ","Nineteen " };
    public String[] numOfTy = {"","", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};
    public String[] powThousand = {"", "Thousand ", "Million ", "Billion "};
    
    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        StringBuilder result = new StringBuilder();
        
        for(int i = 3 ; i >= 0 ; i-- ){
            int n = (int)Math.pow(1000, i);
            if(num >= n){
                int temp = num/n;
                num = num%n;
                result.append(digitDecide(temp)).append(powThousand[i]);
            }
        }
        return result.toString().trim();
    }    
    public String digitDecide(int num) {
        StringBuilder result = new StringBuilder();
        while(num > 0){
            if(num >= 100){
                result.append(underTwenty[num/100]).append("Hundred ");
                num = num%100;
            }
            if(num >= 20){
                result.append(numOfTy[num/10]).append(underTwenty[num%10]);
                num = 0;
            }else{
                result.append(underTwenty[num]);
                num = 0;
            }
        }
        return result.toString();
    }
}
```
![image](https://user-images.githubusercontent.com/97871497/186586458-8e2d8947-8695-42e6-8813-ba89253e448e.png)


VERSION 1
```
class Solution {
    public String numberToWords(int num) {
        String result = "";
        if(num == 0){
            result = "Zero";
            return result;
        }
            if(num >= 1000000000){
                int temp = num / 1000000000;
                num -= (temp*1000000000);
                int tempM = num / 1000000;
                num -= (tempM*1000000);
                int tempT = num / 1000;
                num -= (tempT*1000);
                if(tempM > 0){
                    if(tempT > 0){
                        result = digitTrans(temp, result) + " Billion" + digitTrans(tempM, result) + " Million" + digitTrans(tempT, result) + " Thousand" + digitTrans(num, result);
                    }else{
                        result = digitTrans(temp, result) + " Billion" + digitTrans(tempM, result) + " Million" + digitTrans(num, result);
                    }
                }else{
                    if(tempT > 0){
                        result = digitTrans(temp, result) + " Billion" + digitTrans(tempT, result) + " Thousand" + digitTrans(num, result);
                    }else{
                        result = digitTrans(temp, result) + " Billion" + digitTrans(num, result);
                    }
                }
            }else if(num >= 1000000){
                int temp = num / 1000000;
                num -= (temp*1000000);
                int tempT = num / 1000;
                num -= (tempT*1000);
                if(tempT > 0){
                    result = digitTrans(temp, result) + " Million" + digitTrans(tempT, result) + " Thousand" + digitTrans(num, result);
                }else{
                    result = digitTrans(temp, result) + " Million" + digitTrans(num, result);
                }   
            }else if(num >= 1000){
                int temp = num / 1000;
                num -= (temp*1000);
                result = digitTrans(temp, result) + " Thousand" + digitTrans(num, result);
            }else{
                result = digitTrans(num, result);
            }
        result = result.trim();
        return result;
    }
    public String digitTrans(int num, String result){
        while(num > 0){
            if(num/100 > 0){
                int temp = num/100;
                num -= (temp*100);
                result += " ";
                if(temp == 9){
                    result += "Nine";
                }else if(temp == 8){
                    result += "Eight";
                }else if(temp == 7){
                    result += "Seven";
                }else if(temp == 6){
                    result += "Six";
                }else if(temp == 5){
                    result += "Five";
                }else if(temp == 4){
                    result += "Four";
                }else if(temp == 3){
                    result += "Three";
                }else if(temp == 2){
                    result += "Two";
                }else if(temp == 1){
                    result += "One";
                }
                result += " Hundred";
            }else if(num >= 20){
                result += " ";
                if(num >= 90){
                    result += "Ninety";
                    num -= 90;
                }else if(num >= 80){
                    result += "Eighty";
                    num -= 80;
                }else if(num >= 70){
                    result += "Seventy";
                    num -= 70;
                }else if(num >= 60){
                    result += "Sixty";
                    num -= 60;
                }else if(num >= 50){
                    result += "Fifty";
                    num -= 50;
                }else if(num >= 40){
                    result += "Forty";
                    num -= 40;
                }else if(num >= 30){
                    result += "Thirty";
                    num -= 30;
                }else if(num >= 20){
                    result += "Twenty";
                    num -= 20;
                }

            }else{
                result += " ";
                if(num == 19){
                    result += "Nineteen";
                }else if(num == 18){
                    result += "Eighteen";
                }else if(num == 17){
                    result += "Seventeen";
                }else if(num == 16){
                    result += "Sixteen";
                }else if(num == 15){
                    result += "Fifteen";
                }else if(num == 14){
                    result += "Fourteen";
                }else if(num == 13){
                    result += "Thirteen";
                }else if(num == 12){
                    result += "Twelve";
                }else if(num == 11){
                    result += "Eleven";
                }else if(num == 10){
                    result += "Ten";
                }else if(num == 9){
                    result += "Nine";
                }else if(num == 8){
                    result += "Eight";
                }else if(num == 7){
                    result += "Seven";
                }else if(num == 6){
                    result += "Six";
                }else if(num == 5){
                    result += "Five";
                }else if(num == 4){
                    result += "Four";
                }else if(num == 3){
                    result += "Three";
                }else if(num == 2){
                    result += "Two";
                }else if(num == 1){
                    result += "One";
                }
                break;
            }
        }
        return result;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/184896995-34b32d8e-b508-4b04-b30c-bbf58ccf0a41.png)
