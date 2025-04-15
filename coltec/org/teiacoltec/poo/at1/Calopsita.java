package org.teiacoltec.poo.at1;
import org.teiacoltec.poo.at1.interfaces.Aereo;
import org.teiacoltec.poo.at1.interfaces.Domestico;

public class Calopsita extends Animal implements Aereo, Domestico{
    public Calopsita(String nome, int idade, String som)
    {
        super(nome, idade, som);
    }

    public @Override void baterasas()
    {
        System.out.println(getNome() + " está batendo as asas loucamente!");
    }

    public @Override void voar()
    {
        System.out.println(getNome() + " está voando em sua direção");
    }

    public @Override void levarParaPassear(String parque)
    {
        System.out.println("Você levou sua calopsita " + getNome() + " para o parque " + parque);
    }

    public @Override void brincar(){
        System.out.println("Você brincou com sua calopsita " + getNome() + " e ensinou-a a cantar.");
        emitirSom(10);
    }
}
