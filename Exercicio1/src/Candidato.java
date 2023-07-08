public class Candidato {
    private String nome;
    private String partido;
    private int votos;

    public Candidato(String nome, String partido, int votos) {
        this.nome = nome;
        this.partido = partido;
        this.votos = votos;
    }

    public String getNome() {
        return nome;
    }

    public String getPartido() {
        return partido;
    }

    public int getVotos() {
        return votos;
    }
}
