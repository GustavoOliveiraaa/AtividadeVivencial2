public class Contador {
    private int contador;

    public int contaVeiculosAntigos(Veiculo[][] v, int ano) {
        contador = 0;
        contaVeiculosAntigos(v, ano, 0, 0);
        return contador;
    }

    private void contaVeiculosAntigos(Veiculo[][] v, int ano, int linha, int coluna) {
        if (linha >= v.length) {
            return;
        }

        if (coluna >= v[linha].length) {
            contaVeiculosAntigos(v, ano, linha + 1, 0);
            return;
        }

        if (v[linha][coluna].getAnoFabricacao() < ano) {
            contador++;
        }

        contaVeiculosAntigos(v, ano, linha, coluna + 1);
    }
}