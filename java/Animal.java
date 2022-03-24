public class Animal{
    String especie;
    String nome;
    String tipo;

    Animal(String especie){
        this.especie = especie;
    }

    String arno(){
        String arno = especie + "  " + nome;
        return arno;
    }
    String arnu(){
        String arnu = especie + "  " + tipo;
        return arnu;
    }
    String arna(){
        String arna = tipo + "  " + nome;
        return arna;
    }
    
    

}