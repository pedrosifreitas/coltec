package org.teiacoltec.poo.at1;
import org.teiacoltec.poo.at1.excecoes.AnimalJaExisteException;
import org.teiacoltec.poo.at1.excecoes.AnimalNaoExisteException;

public class Zoologico {
    private Animal animais[];

    public Zoologico()
    {
        animais = new Animal[0];
    }

    public Animal[] getAnimais() { return animais; }

    public void Adicionar(Animal animal) throws AnimalJaExisteException
    {
        for(int i = 0; i < animais.length && animais.length != 0; i ++)
            if(animais[i].getNome().equals( animal.getNome() ))
                throw new AnimalJaExisteException();

        Animal tmp_animais[] = animais;
        animais = new Animal[animais.length + 1];
        animais[tmp_animais.length] = animal;

        System.arraycopy(
            tmp_animais, 0, 
            animais, 0, 
            tmp_animais.length
        );
    }
    
    public void Remover(String nome) throws AnimalNaoExisteException
    {
        for(int i = 0; i < animais.length; i ++)
            if(animais[i].getNome().equals( nome ))
            {
                Animal tmp_animais[] = animais;

                tmp_animais[i] = animais[animais.length - 1];
                animais = new Animal[animais.length - 1];

                System.arraycopy(
                    tmp_animais, 0,
                    animais, 0, 
                    animais.length - 1
                );

                return;
            }
        

        //joga exceção se o código não parou antes (ou seja, não achou o nome do animal)
        throw new AnimalNaoExisteException();
    }

    public Animal BuscarAnimal(String nome) throws AnimalNaoExisteException
    {
        for(int i = 0; i < animais.length; i ++)
            if(animais[i].getNome().equals( nome ))
                return animais[i];
        

        //joga exceção se o código não parou antes (ou seja, não achou o nome do animal)
        throw new AnimalNaoExisteException();
    }
}
