package net.yorksolutions.fizzbuzzgame;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {
    String fizzBuzz(int givenNum){
        if (givenNum % 5 == 0 && givenNum % 3 == 0) {
            return "FizzBuzz";
        } else if ( givenNum % 3 == 0 ) {
            return "Fizz";
        } else if ( givenNum % 5 == 0 ) {
            return "Buzz";
        } else {
            return String.format("%d", givenNum);
        }
    }
}
