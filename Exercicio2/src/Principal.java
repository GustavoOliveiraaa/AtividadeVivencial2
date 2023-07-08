import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
	    Veiculo[][] veiculos = new Veiculo[3][3];
	    Random random = new Random();
	    //Lista de marcas
	    List<String> marcas = new ArrayList<>();
	    marcas.add("Chevrolet");
	    marcas.add("Fiat");
	    marcas.add("Ford");
	    marcas.add("Honda");
	    marcas.add("Hyundai");
	    marcas.add("Renault");
	    
	    //Lista de modelos 
	    List<String> modelos = new ArrayList<>();
	    modelos.add("Corsa");
	    modelos.add("Palio");
	    modelos.add("Fiesta");
	    modelos.add("Civic");
	    modelos.add("HB20");
	    modelos.add("Sandero");

	    for (int i = 0; i < veiculos.length; i++) {
	        for (int j = 0; j < veiculos[i].length; j++) {
	            String marca = marcas.get(random.nextInt(marcas.size()));
	            String modelo = modelos.get(random.nextInt(modelos.size()));
	            // gera um ano aleatório entre 1970 e 2022
	            int ano = random.nextInt(53) + 1970; 
	            veiculos[i][j] = new Veiculo(marca, modelo, ano);
	        }
	    }

	    Contador contador = new Contador();
	    int qtdVeiculosAntigos = contador.contaVeiculosAntigos(veiculos, 2000);

	    System.out.println("Quantidade de veículos antigos: " + qtdVeiculosAntigos);
	    System.out.println("Veículos:");
	    for (int i = 0; i < veiculos.length; i++) {
	        for (int j = 0; j < veiculos[i].length; j++) {
	            System.out.println(veiculos[i][j].getNome() + " " +veiculos[i][j].getMarca() + " " + veiculos[i][j].getAnoFabricacao());
	        }
	    }
	}



}
