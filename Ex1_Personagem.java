public class Ex1_Personagem {
    private String nome; //variável de instância e referência
    private int energia = 10; //variável primitiva (própria da classe)
    private int fome;
    private int sono;
    final static int LIMITE_SUPERIOR = 10;

    public Ex1_Personagem(int energia, int fome, int sono){
        if(energia >=0 && energia <=10)
            this.energia = energia;
        if(fome >=0 && fome <=10)
            this.fome = fome;
        if(sono >=0 && sono <=10)
            this.sono = sono;
    }

    public Ex1_Personagem(String nome, int energia, int fome, int sono){
        this(energia, fome, sono); //chamando construtor
        this.nome = nome;
    }

    //setter e getter (Permitem interação indireta com a variável primitiva)
    public void setNome(String nome){
        this.nome = nome;
        System.out.println(nome);
    }

    public String getNome(){
        return this.nome;
    }

    void cacar(){
        if(this.energia >= 2){
            System.out.println(nome + " cacando...");
            this.energia = this.energia - 2;
            exibir();
        }
        else{
            System.out.println(nome + " sem energia para cacar");
            exibir();
        }
        this.fome = Math.min(this.fome + 1, LIMITE_SUPERIOR); //definição de valor mínimo da varíavel
        this.sono = Math.min(this.sono + 1, LIMITE_SUPERIOR);
    }

    void comer(){
        if (this.fome >= 1){
            System.out.println(this.nome + " comendo...");
            this.fome -= 1;
            //this.energia += 1;
            this.energia = this.energia + 1 <= LIMITE_SUPERIOR ? this.energia + 1 : this.energia;
            exibir();
        }
        else{
            System.out.printf("%s sem fome...", nome);
            exibir();
        }
    }

    void dormir(){
        if(this.sono >= 1){
            System.out.println(String.format(
                "%s dormindo...",
                nome
            ));
            this.sono -= 1;
            exibir();
            this.energia = this.energia + 1 <= LIMITE_SUPERIOR ? this.energia + 1 : this.energia;
        }
        else{
            System.out.println(nome + " sem sono...");
            exibir();
        }
    }

    void exibir(){
        System.out.printf("(energia: %d, fome: %d, sono: %d)\n",this.energia, this.fome, this.sono);
    } 
}
