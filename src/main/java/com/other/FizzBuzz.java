package com.other;

public class FizzBuzz {
    public void fizzBuzz(int times) {
        for (int i = 1; i <= times; i++) {
            String res = "";
            if (i % 3 == 0) {
                res += "Fizz";
            }
            if (i % 5 == 0) {
                res += "Buzz";
            }
            if (res.isEmpty()) {
                res += i;
            }
            System.out.println(res);
        }
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz(30);
    }
}
