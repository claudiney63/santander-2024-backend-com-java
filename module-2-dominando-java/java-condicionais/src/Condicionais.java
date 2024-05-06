public class Condicionais {
    public static void main(String[] args) throws Exception {
        //Condicional simples
        int idade = 18;
        if(idade >= 18){
            System.out.println("Maior de idade");
        }

        //Condicional composta
        int idade2 = 17;
        if(idade2 >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }

        //Condicional encadeada
        int idade3 = 17;
        if(idade3 < 16){
            System.out.println("Não vota");
        }else if((idade3 >= 16 && idade3 < 18) || (idade3 > 70)){
            System.out.println("Voto opcional");
        }else{
            System.out.println("Voto obrigatório");
        }

        //Switch case
        int dia = 5;
        switch(dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
        }
    }
}
