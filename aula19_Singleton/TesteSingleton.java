package aula19_Singleton;

public class TesteSingleton {
    public static void main(String[] args) {

        // Criando um onjeto Singleton
        Singleton singleton = Singleton.getInstancia();
        Singleton singleton2 = Singleton.getInstancia();
        Singleton singleton3 = Singleton.getInstancia();

        // Acesso pelo objeto
        System.out.println("Objeto <singleton>: " + singleton);
        System.out.println("Objeto <singleton>: " + singleton2);
        System.out.println("Objeto <singleton>: " + singleton3);

        // Acesso pelo método
        System.out.println(Singleton.getInstancia());
        System.out.println("--------------------");
        System.out.println(Singleton.getInstancia());
        System.out.println("--------------------");
        System.out.println(Singleton.getInstancia());

    }
}
