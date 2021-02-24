package com.company;

public class StringManager {

    public String convert(String value){
        String lettersLowercase = "abcdefghijklmnñopqrstuvwxyz";
        String lettersUppercase = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        char[] res = value.toCharArray();

        for(int i=0; i<value.length(); i++)
        {
            if(Character.isLetter(value.charAt(i)))
            {
                if (res[i] == 'z' || res[i] == 'Z')
                {
                    res[i] = Character.isLowerCase(value.charAt(i)) == true ? 'a' : 'A';
                }
                else
                {
                    String letters = Character.isLowerCase(value.charAt(i)) ? lettersLowercase : lettersUppercase;
                    int index = letters.indexOf(res[i]);
                    res[i] = letters.toCharArray()[index+1];
                }
            }
        }
        return String.valueOf(res);
    }
}
