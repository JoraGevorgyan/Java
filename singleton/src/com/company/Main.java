package com.company;

import single.Single;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String message = in.nextLine();

        Single single = Single.getSingle();

        single.showMsg(message);
    }
}
