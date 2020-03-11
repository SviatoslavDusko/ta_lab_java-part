package com.epam.lab.hw_17_jdbc.menu.state;

import com.epam.lab.hw_17_jdbc.menu.Menu;

public interface State {

    default void signIn(Menu menu) {
        System.out.println("sign in is not allowed");
    }

    default void signUp(Menu menu) {
        System.out.println("sign up is not allowed");
    }

    default void buyOrRent(Menu menu) {
        System.out.println("buy or rent is not allowed");
    }

    default void sellOrToLease(Menu menu) {
        System.out.println("sell or to lease is not allowed");
    }

    default void sell(Menu menu) {
        System.out.println("sell is not allowed");
    }

    default void toLease(Menu menu) {
        System.out.println("to lease is not allowed");
    }

    default void addFlat(Menu menu) {
        System.out.println("add flat is not allowed");
    }

    default void setCharacteristicsSearchingFlat(Menu menu) {
        System.out.println("set characteristics is not allowed");
    }

    default void notFound(Menu menu) {
        System.out.println("not found is not allowed");
    }

    default void found(Menu menu) {
        System.out.println("found is not allowed");
    }

    default void sendEmailOwner(Menu menu) {
        System.out.println("send email is not allowed");
    }

    default void callOwner(Menu menu) {
        System.out.println("call is not allowed");
    }

    default void deleteFlat(Menu menu) {
        System.out.println("delete is not allowed");
    }
}
