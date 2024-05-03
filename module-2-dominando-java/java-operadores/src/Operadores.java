public class Operadores {
    public static void main(String[] args) throws Exception {

        //Atribuição
        int a = 10;

        //Aritméticos
        int b = 5;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;

        //Relacionais
        boolean h = a > b;
        boolean i = a < b;
        boolean j = a >= b;
        boolean k = a <= b;
        boolean l = a == b;
        boolean m = a != b;

        //Lógicos
        boolean n = true;
        boolean o = false;
        boolean p = n && o;
        boolean q = n || o;
        boolean r = !n;

        //Incremento e Decremento
        int s = 10;
        s++;
        s--;
        int t = 10;
        int u = t++;
        int v = t--;

        //Unario
        int n1 = 10;
        int n2 = -n1;

        //Ternário
        int w = 10;
        int x = 5;
        int y = w > x ? w : x;

        //Concatenação
        String z = "Hello, ";
        String aa = "World!";
        String ab = z + aa;

        //Conversão
        int ac = 10;
        double ad = ac;
        int ae = (int) ad;

        //Saída
        System.out.println("Atribuição: " + a);
        System.out.println("Aritméticos: " + c + ", " + d + ", " + e + ", " + f + ", " + g);
        System.out.println("Relacionais: " + h + ", " + i + ", " + j + ", " + k + ", " + l + ", " + m);
        System.out.println("Lógicos: " + p + ", " + q + ", " + r);
        System.out.println("Incremento e Decremento: " + s + ", " + t + ", " + u + ", " + v);
        System.out.println("Unário: " + n2);
        System.out.println("Ternário: " + y);
        System.out.println("Concatenação: " + ab);
        System.out.println("Conversão: " + ad + ", " + ae);
    }
}
