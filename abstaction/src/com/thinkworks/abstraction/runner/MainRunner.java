package com.thinkworks.abstraction.runner;

import com.thinkworks.abstraction.internal.*;


public class MainRunner {

    public static void main(String[] args) {

        Guitar guitar = new Guitar();
        guitar.play();
        guitar.stop();
        guitar.tune();

        System.out.println(" ");

        Chess chess = new Chess();
        chess.startGame();
        chess.play();
        chess.endGame();

        System.out.println(" ");

        JavaCourse javaCourse = new JavaCourse();
        javaCourse.enroll();
        javaCourse.teach();
        javaCourse.grade();

        System.out.println(" ");

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit();
        savingsAccount.withdraw();
        savingsAccount.credit();
    }
}
