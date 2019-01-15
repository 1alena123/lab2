package com.company;

public class PasswordGenerator {
    public String generate(int length){

        int var;
        StringBuilder builder = new StringBuilder();

        for (int i=0; i<length; i++){
            var = (int)(Math.random()*100)%3;
            switch (var){
                case 0:
                    builder.append((char)(((int)(Math.random()*1000)%26)+65));
                    break;
                case 1:
                    builder.append((char)(((int)(Math.random()*1000)%26)+97));
                    break;
                case 2:
                    builder.append((int)(Math.random()*10));
                    break;


            }
        }
        System.out.println("Пароль:  ");
        return builder.toString();
    }
}