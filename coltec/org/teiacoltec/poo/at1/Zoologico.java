package org.teiacoltec.poo.at1;
import org.teiacoltec.poo.at1.interfaces.Domestico;

public class Zoologico{
    public static void main(String[] args) {
        Mamifero lontra = new Mamifero("Limbo", 12, "Krrr!", "Curto");
        Reptil camaleao = new Reptil("Zima", 6, "...", "Escamosa");
        Ave cacatua = new Ave("Lia", 21, 5.12);

        exibirAnimal(lontra);
        exibirAnimal(camaleao);
        exibirAnimal(cacatua);

        System.out.println(lontra.getNome() + " tem pelos do tipo " + lontra.getTipoDePelo());
        cacatua.emitirSom(20);

        Calopsita Amarelinha = new Calopsita("Amarelinha", 0, "*Oitava sinfonia de Beethoven*");
        interagirComAnimalDomestico(Amarelinha);
    }

    public static void interagirComAnimalDomestico(Domestico pet)
    {
        pet.levarParaPassear("Rondônia");
        pet.brincar();
    }

    public static void exibirAnimal(Animal animal){
        System.out.println("Este é o " + animal.getNome() + ". Ele tem " + animal.getIdade() + " anos de idade.");
        System.out.println("Ouça um dos sons que ele faz:");
        animal.emitirSom();
    }
}
