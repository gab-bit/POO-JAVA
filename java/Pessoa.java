public class Pessoa{
    String nome;
    int idade;
    String sobrenome;
    String altura;
    String cabelo;


    void escrevernome(){
        System.out.println(nome + "" + sobrenome);
        
       
    }
    void escreveridade(){
        System.out.println(idade);
    }
    void somaridade(int idade){
        this.idade = this.idade + idade;
    }
    Pessoa(String nome){
        this.nome = nome; 
        
    }
    void escrevercabelo(){
        System.out.println(cabelo);
    }
    void escreveraltura(){
        System.out.println(altura);
    }
    
    
}