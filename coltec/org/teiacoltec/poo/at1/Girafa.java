package org.teiacoltec.poo.at1;
import org.teiacoltec.poo.at1.interfaces.Terrestre;

public class Girafa extends Animal implements Terrestre{
    public Girafa(String nome, int idade)
    {
        super(nome, idade, "...");
    }

    public @Override void andar()
    {
        System.out.println(getNome() + " está caminhando calmamente");
    }

    public @Override void correr()
    {
        System.out.println(getNome() + " está correndo, mas tropeça");
    }

    public @Override void pensar()
    {
        System.out.println(getNome() + " está pensando sobre as folhas das árvores");
    }
}
