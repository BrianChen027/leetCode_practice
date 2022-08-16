class Solution {
    public int romanToInt(String s) {
        char ch[] = s.toCharArray();
        int sum = 0;
        for(int i = 0; i < ch.length ; i++){
            if(ch[i] == 'I'){
                sum += 1;
            }else if(ch[i] == 'V'){
                if(i>0 && ch[i-1] == 'I') sum -= 2;
                sum += 5;
            }else if(ch[i] == 'X'){
                if(i>0 && ch[i-1] == 'I') sum -= 2;
                sum += 10;
            }else if(ch[i] == 'L'){
                if(i>0 && ch[i-1] == 'X') sum -= 20;
                sum += 50;
            }else if(ch[i] == 'C'){
                if(i>0 && ch[i-1] == 'X') sum -= 20;
                sum += 100;
            }else if(ch[i] == 'D'){
                if(i>0 && ch[i-1] == 'C') sum -= 200;
                sum += 500;
            }else if(ch[i] == 'M'){
                if(i>0 && ch[i-1] == 'C') sum -= 200;
                sum += 1000;
            }
        }     
        return sum;
    }
}
