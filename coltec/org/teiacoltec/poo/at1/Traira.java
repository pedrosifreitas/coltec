package org.teiacoltec.poo.at1;
import org.teiacoltec.poo.at1.interfaces.Aquatico;

public class Traira extends Animal implements Aquatico{

    public Traira(String nome, int idade)
    {
        super(nome, idade, "Glub glub");
    }

    public @Override void nadar()
    {
        System.out.println(getNome() + " está nadando com destreza");
    }

    public @Override void morrer(int ph)
    {
        if(ph > 10 || ph < 5)
            System.out.println(getNome() + " morreu");
        else
            System.out.println(getNome() + " vive e passa bem.");
    }
    
}
