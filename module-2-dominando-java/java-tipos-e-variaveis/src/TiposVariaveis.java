public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //Tipos primitivos
        byte b = 127; // 8 bits
        short s = 32767; // 16 bits
        int i = 2147483647; // 32 bits
        long l = 9223372036854775807L; // 64 bits
        float f = 3.4028235E38f; // 32 bits

        //Strings
        String nome = "Fulano de Tal";

        //Boolean
        boolean ativo = true;

        //Variavel constante
        final double PI = 3.14159265359;

        //Cast 
        int x = 10;
        byte y = (byte) x;

        //Mudando valor da Variavel
        b = 100;

        //Impressão
        System.out.println("byte: " + b);
    }
}
