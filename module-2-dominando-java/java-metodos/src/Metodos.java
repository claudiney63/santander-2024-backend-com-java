public class Metodos {

    //Metodo em java
    public void sayHello() {
        System.out.println("Hello!");
    }

    //Metodos com parametros
    public void sayHelloTo(String name) {
        System.out.println("Hello " + name + "!");
    }

    //Metodos com retorno
    public String sayHelloToReturn(String name) {
        return "Hello " + name + "!";
    }

    //Metodos com retorno e parametros
    public String sayHelloToReturn(String name, String lastName) {
        return "Hello " + name + " " + lastName + "!";
    }

    //Metodos privados
    //Metodos privados não podem ser acessados fora da classe
    private void sayHelloPrivate() {
        System.out.println("Hello!");
    }

    //Metodos protegidos
    //Metodos protegidos podem ser acessados por classes filhas
    protected void sayHelloProtected() {
        System.out.println("Hello!");
    }

    //Metodos estaticos
    //Metodos estaticos podem ser acessados sem instanciar a classe
    public static void sayHelloStatic() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) throws Exception {
        Metodos metodos = new Metodos();
        metodos.sayHello();
        metodos.sayHelloTo("John");
        System.out.println(metodos.sayHelloToReturn("John"));
        System.out.println(metodos.sayHelloToReturn("John", "Doe"));
        Metodos.sayHelloStatic();
    }
}


