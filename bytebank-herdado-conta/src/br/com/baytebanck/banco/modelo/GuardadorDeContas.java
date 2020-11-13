package br.com.baytebanck.banco.modelo;

public class GuardadorDeContas {

    private Conta[] referencias;
    int posicaoLivre;

    public GuardadorDeContas() {
        this.referencias = new Conta[10];
        this.posicaoLivre = 0;
    }
    
    public int adiciona(Conta ref) {
    	referencias[this.posicaoLivre] = ref;
        return this.posicaoLivre++;
    	
    	}
    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

	public Conta getReferencia(int i) {
		return this.referencias[i];
		
	}
}
