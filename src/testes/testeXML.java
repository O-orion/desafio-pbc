package testes;

import component.Serializacao;
import exceptions.SerializableExcetion;
import models.Carro;
import models.Pessoa;

public class testeXML {

    public static void main(String[] args) {

        Serializacao sr = new Serializacao();
        Pessoa p1 = new Pessoa("Lucas", 22);
        Carro c1 = new Carro("Azul", "BMW");

        try{

            sr.serializarXML(p1);
            sr.serializarXML(c1);

            Carro carroDesserializadoXML = (Carro) sr.desserializadorXML("models.Carro.xml");
            Pessoa pessoaDesserializadaXML = (Pessoa) sr.desserializadorXML("models.Pessoa.xml");

            System.out.println("Carro: " +  carroDesserializadoXML.toString());
            System.out.println("Pessoa: " + pessoaDesserializadaXML.toString());

        }catch (SerializableExcetion e){
            System.out.println("ERRO: " + e.getMessage());
        }

    }
}
