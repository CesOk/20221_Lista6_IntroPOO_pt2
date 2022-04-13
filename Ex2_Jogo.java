import java.util.Random;

public class Ex2_Jogo {
    public static void main(String[] args) throws Exception{
        Ex1_Personagem cacador = new Ex1_Personagem(2,4,0);        
        Ex1_Personagem soneca = new Ex1_Personagem(2,4,10);
        Ex1_Personagem guloso = new Ex1_Personagem(4,10,2);

        Ex1_Personagem atleta = new Ex1_Personagem(10,5,0);
        //cacador.setNome("Caçador");
        atleta.setNome("Atleta");
        Random gerador = new Random();
        // // 1: cacar
        // // 2: comer
        // // 3: dormir

        System.out.println("==================================");
        while(true){
            int oQueFazer = gerador.nextInt(3) + 1; //[1,3]
            //fall-through
            switch(oQueFazer){
                case 1:
                    atleta.cacar();
                    break;
                case 2:
                    atleta.comer();
                    break;
                case 3:
                    atleta.dormir();
                    break;
            }
            System.out.println("==================================");
            Thread.sleep(2000); //pausa de 2s sobre o processo
        }
        
        
        // Personagem p = new Personagem();
        // p.nome = "João";
        // p.cacar();
        // p.comer();
        // p.dormir();
    }
}
