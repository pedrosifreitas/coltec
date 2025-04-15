package org.teiacoltec.poo.at1;

public abstract class Animal {
    private String nome;
    private int idade;
    private String som;

    public Animal(String nome, int idade, String som)
    {
        this.nome = nome;
        this.idade = idade;
        this.som = som;
    }

    public void emitirSom()
    {
        System.out.println(this.nome + ": " + som);
    }

    public void emitirSom(int intensidade)
    {
        if(intensidade < 5)
            emitirSom();
        else 
        {
            System.out.print(this.nome + ": " + som);

            for(int i = (int) intensidade/5; i > 0; i --)
                System.out.print("!");

            System.out.print("\n");

        }
    }

    public String getNome() { return this.nome; }
    public int getIdade() { return this.idade; }
}
