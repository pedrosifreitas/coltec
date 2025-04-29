package org.teiacoltec.poo.at1.excecoes;

public class AnimalJaExisteException extends Exception{
    public AnimalJaExisteException(){
        super("Um animal com esse nome já existe nesta lista!");
    }
}