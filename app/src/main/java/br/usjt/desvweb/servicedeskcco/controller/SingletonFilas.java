package br.usjt.desvweb.servicedeskcco.controller;

/**
 * Created by Filipe Roque on 21/04/18.
 */

public class SingletonFilas {
    private static final SingletonFilas ourInstance = new SingletonFilas();

    public static SingletonFilas getInstance() {
        return ourInstance;
    }

    private SingletonFilas() {
    }
}
