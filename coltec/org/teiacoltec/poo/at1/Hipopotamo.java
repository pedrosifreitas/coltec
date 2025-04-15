package org.teiacoltec.poo.at1;
import org.teiacoltec.poo.at1.interfaces.Aquatico;
import org.teiacoltec.poo.at1.interfaces.Terrestre;

public class Hipopotamo extends Animal implements Aquatico, Terrestre{
    public Hipopotamo(String nome, int idade){
        super(nome, idade, "...");
    }

    public @Override void andar()
    {
        System.out.println(getNome() + " está caminhando calmamente");
    }

    public @Override void correr()
    {
        System.out.println(getNome() + " está correndo a uma velocidade muito superior a humana");
    }

    public @Override void pensar()
    {
        System.out.println(getNome() + " está pensando sobre a água");
    }

    public @Override void nadar()
    {
        System.out.println(getNome() + " está nadando com destreza");
    }

    public @Override void morrer(int ph){
        System.out.println(getNome() + " morreu afogado devido ao fato de que, na realidade, hipopotamos não são capazes de nadar. (O pH da água pouco teve a ver)");
    }

}
