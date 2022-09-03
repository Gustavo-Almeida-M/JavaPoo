public class App {
    public static void main(String[] args) throws Exception 
    {
        Celular celularA = new Celular();    

        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.ano = 2021;


        System.out.println(celularA.nome + " " + celularA.ano + " " + celularA.tamanhoTela);
    }
}
