import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Random random = new Random();
        Candidato[] candidatos = new Candidato[4];
        candidatos[0] = new Candidato("Leorio Paradinight ", "Partido A", random.nextInt(1001));
        candidatos[1] = new Candidato("Ging Freecss", "Partido B", random.nextInt(1001));
        candidatos[2] = new Candidato("Pariston Hill", "Partido C", random.nextInt(1001));
        candidatos[3] = new Candidato("Cheadle Yorkshire", "Partido D", random.nextInt(1001));

        try {
            IBOPE ibope = new IBOPE();
            Candidato melhorCandidato = ibope.candidatoMelhorColocado(candidatos);
            System.out.println("O candidato melhor colocado é: " + melhorCandidato.getNome() + " (" + melhorCandidato.getPartido() + ") com " + melhorCandidato.getVotos() + " votos.");
        } catch (ArrayNotPossibleException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}


