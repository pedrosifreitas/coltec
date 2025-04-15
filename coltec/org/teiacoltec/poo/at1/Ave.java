package org.teiacoltec.poo.at1;
import org.teiacoltec.poo.at1.interfaces.Aereo;

public class Ave extends Animal implements Aereo{
    private double enverguraAsas;

    public Ave(String nome, int idade, double enverguraAsas)
    {
        super(nome, idade,"Ah! Ahrah!");
        this.enverguraAsas = enverguraAsas;
    }

    public @Override void baterasas()
    {
        System.out.println(getNome() + " está batendo as asas loucamente!");
    }

    public @Override void voar()
    {
        System.out.println(getNome() + " está voando.");
        
        if(getIdade() <= 5)
            System.out.println(getNome() + ": Olha mamãe, sem as mãos!");
    }

    public double getEnverguraAsas() { return enverguraAsas; }
}
