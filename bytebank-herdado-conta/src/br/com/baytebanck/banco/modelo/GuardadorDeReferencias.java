package br.com.baytebanck.banco.modelo;

public class GuardadorDeReferencias {

	private Object[] referencias;
    int posicaoLivre;

    public GuardadorDeReferencias(){
    	this.referencias = new Object[10];
        this.posicaoLivre = 0;
	}
    
    public int adiciona(Object ref) {
    	referencias[this.posicaoLivre] = ref;
        return this.posicaoLivre++;
    	
    	}
    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

	public Object getReferencia(int i) {
		return this.referencias[i];
		
	}
}
