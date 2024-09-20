package aula19_Singleton;

public class Singleton {
    private static Singleton instancia;

    private Singleton() {
    }

    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
            System.out.println("Objeto Singleton Criado!");
        } else {
            System.out.println("Já existe um objeto SINGLETON criado!");
        }

        return instancia;

    }
}