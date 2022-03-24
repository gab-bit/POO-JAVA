public class Projeto {
    public static void main(String[]args){
        Pessoa eu = new Pessoa("gabriel");
        eu.nome = "gabriel";
        eu.sobrenome = "deoclides";
        eu.cabelo = "ruivo";
        eu.altura = "1,75";
        eu.escrevernome();
        eu.idade = 20;
        eu.escreveridade();
  
        eu.somaridade(4);
        System.out.println(eu.idade);
        eu.escrevercabelo();
        eu.escreveraltura();
        

        Animal ele = new Animal("especie");
        ele.especie = "leao";
        ele.nome = "leonidas";
        ele.tipo = "felino";
        
        System.out.println(ele.arno());
        System.out.println(ele.arnu());
        System.out.println(ele.arna());



    }
}
