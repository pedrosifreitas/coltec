package org.teiacoltec.poo.at1.excecoes;

public class AnimalNaoExisteException extends Exception{
    public AnimalNaoExisteException(){
        super("Não existe animal algum com esse nome na lista!");
    }
}