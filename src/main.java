import component.Serializacao;
import exceptions.SerializableExcetion;
import models.Carro;
import models.Pessoa;

public class main {
    public static void main(String[] args) {
        Serializacao sr = new Serializacao();
        Pessoa p1 = new Pessoa("Lucas", 10);
        Carro c1 = new Carro("Ferrari", "Vermelha");

        try {
            sr.serializarDAT(p1);
            sr.serializarDAT(c1);
            Carro carroDesserializado = (Carro)  sr.desserializarDAT("models.Carro.dat");
            Pessoa pessoaDesserializada = (Pessoa) sr.desserializarDAT("models.Pessoa.dat");

            System.out.println("Carro: " + carroDesserializado.toString());
            System.out.println("Pessoa: " + pessoaDesserializada.toString());

        }catch (SerializableExcetion e){
            System.out.println(e.getMessage());
        }


    }
}
