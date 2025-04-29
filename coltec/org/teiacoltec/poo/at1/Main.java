package org.teiacoltec.poo.at1;

public class Main{

    public static void main(String[] args) {
        Zoologico jardimZoologico = new Zoologico();
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String input;
        
        while (true) 
        { 
            System.out.println("Escreva o que quer fazer:\n");
            System.out.println("[A]dicionar animal");
            System.out.println("[R]emover animal");
            System.out.println("[P]rocurar animal\n");

            input = scan.nextLine();
            
            try 
            {
                switch(input)
                {
                    case "A":
                        System.out.println("Escreva o nome do animal");
                        String nome = scan.nextLine();
                        System.out.println("Escreva a idade do animal");
                        int idade = scan.nextInt();
                        System.out.println("Escreva o som do animal");
                        String som = scan.nextLine();

                        jardimZoologico.Adicionar(new Calopsita(nome, idade, som));
    
                        break;
                    
                    case "R":
                        System.out.println("Escreva o nome do animal a ser removido");
                        input = scan.nextLine();

                        jardimZoologico.Remover(input);
                        break;

                    case "P":
                        System.out.println("Escreva o nome do animal a encontrar");
                        input = scan.nextLine();

                        Animal animal = jardimZoologico.BuscarAnimal(input);
                        System.out.println("Animal: " + animal.getNome() + "\nIdade: " + animal.getIdade());
                }
            }
            catch (Exception ex) 
            {
                System.out.println("Ocorreu um erro na execução: " + ex.getMessage());
            }
        }
    }

    public static void interagirComAnimalDomestico(org.teiacoltec.poo.at1.interfaces.Domestico pet)
    {
        pet.levarParaPassear("Parque Municipal");
        pet.brincar();
    }

    public static void exibirAnimal(Animal animal){
        System.out.println("Este é o " + animal.getNome() + ". Ele tem " + animal.getIdade() + " anos de idade.");
        System.out.println("Ouça um dos sons que ele faz:");
        animal.emitirSom();
    }
}
