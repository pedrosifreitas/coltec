package org.teiacoltec.poo.at1;
import org.teiacoltec.poo.at1.interfaces.Aquatico;
import org.teiacoltec.poo.at1.interfaces.Terrestre;

public class Reptil extends Animal implements Aquatico, Terrestre{
    private String tipoDeEscama;
    
    public Reptil(String nome, int idade, String som, String tipoDeEscama)
    {
        super(nome, idade, som);

        this.tipoDeEscama = tipoDeEscama;
    }

    public @Override void andar()
    {
        this.Rastejar();
    }

    public @Override void correr()
    {
        this.Rastejar();
    }

    public @Override void pensar()
    {
        System.out.println(getNome() + " está pensando sobre a pedra massiva que está próxima de destruir toda a vida conhecida na Terra até então");
    }

    public @Override void nadar()
    {
        System.out.println(getNome() + " está nadando com destreza");
    }

    public @Override void morrer(int ph){
        System.out.println(getNome() + " morreu afogado (O pH da água pouco teve a ver)");
    }

    public void Rastejar()
    {
        System.out.println(getNome() + " está rastejando por aí");
    }

    public String getTipoDeEscama() { return this.tipoDeEscama; }
}