package org.teiacoltec.poo.at1;
import org.teiacoltec.poo.at1.interfaces.Terrestre;

public class Mamifero extends Animal implements Terrestre{
    private String tipoDePelo;
    
    public Mamifero(String nome, int idade, String som, String tipoDePelo)
    {
        super(nome, idade, som);

        this.tipoDePelo = tipoDePelo;
    }

    public @Override void andar()
    {
        System.out.println(getNome() + " está pensando sobre o Sol");
    }

    public @Override void correr()
    {
        System.out.println(getNome() + " está pensando sobre o Sol");
    }

    public @Override void pensar()
    {
        System.out.println(getNome() + " está pensando sobre mato");
    }

    public void Amamentar()
    {
        if(getIdade() < 7)
            System.out.println(getNome() + " está sendo amamentado pela sua mãe");
        else
            System.out.println(getNome() + " está amamentando o seu filhote");
    }

    public String getTipoDePelo() { return this.tipoDePelo; }
}
