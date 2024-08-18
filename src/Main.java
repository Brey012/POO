public class Main {

//    Voy a definir mi molde, o sea mi clase, definir sus atributos y sus métodos.
static class Carro {
//        Estos son los atributos de mi clase, de mi carro
//    Los atributos vienen siendo características de mi carro(clase)
        String color;
        String modelo;
        String marca;
        int potencia;

//        Estas son las acciones que puede hacer mi carro
//    estas son los métodos(funciones), mensajes que llaman a mi clase para que cumplan una acción
        void acelerar(){
            System.out.println("El carro esta avanzando");
        }

        void frenar(){
            System.out.println("El carro esta parando");
        }
}

    public static void main(String[] args) {
//     aquí ya llamamos el método constructor Carro con la palabra clave new para indicar que estamos
//     creando una nueva instancia en la clase Carro
        Carro carro1 = new Carro();
        carro1.color = "rojo";
        carro1.marca = "Porsche";
        carro1.modelo = "Gt3 rs";
        carro1.potencia = 525;

        carro1.acelerar();
        carro1.frenar();
    }
}
