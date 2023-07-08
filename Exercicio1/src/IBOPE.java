public class IBOPE {
    public Candidato candidatoMelhorColocado(Candidato[] candidatos) throws ArrayNotPossibleException {
        if (candidatos == null) {
            throw new ArrayNotPossibleException("O array de candidatos é nulo.");
        }

        if (candidatos.length == 1) {
            return candidatos[0];
        }

        return candidatoMelhorColocado(candidatos, 0, candidatos.length - 1);
    }

    private Candidato candidatoMelhorColocado(Candidato[] candidatos, int inicio, int fim) {
        if (inicio == fim) {
            return candidatos[inicio];
        }

        int meio = (inicio + fim) / 2;

        Candidato candidato1 = candidatoMelhorColocado(candidatos, inicio, meio);
        Candidato candidato2 = candidatoMelhorColocado(candidatos, meio + 1, fim);

        return compararCandidatos(candidato1, candidato2);
    }

    private Candidato compararCandidatos(Candidato candidato1, Candidato candidato2) {
        if (candidato1 == null) {
            return candidato2;
        }

        if (candidato2 == null) {
            return candidato1;
        }

        if (candidato1.getVotos() > candidato2.getVotos()) {
            return candidato1;
        } else {
            return candidato2;
        }
    }
}

@SuppressWarnings("serial")
class ArrayNotPossibleException extends Exception {
    public ArrayNotPossibleException(String mensagem) {
        super(mensagem);
    }
}