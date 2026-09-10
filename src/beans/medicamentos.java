package beans;

public class medicamentos {
    
   
    String nome;
    String classe;
    String indicacoes;
    String via_administracao;
    String modoUso;
    String formaDiluicao;
    String cuidadosEnfermagem;

    public medicamentos() {
    }

    public medicamentos(String nome, String classe, String indicacoes, String via_administracao, String modoUso, String formaDiluicao, String cuidadosEnfermagem) {
        this.nome = nome;
        this.classe = classe;
        this.indicacoes = indicacoes;
        this.via_administracao = via_administracao;
        this.modoUso = modoUso;
        this.formaDiluicao = formaDiluicao;
        this.cuidadosEnfermagem = cuidadosEnfermagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getIndicacoes() {
        return indicacoes;
    }

    public void setIndicacoes(String indicacoes) {
        this.indicacoes = indicacoes;
    }

    public String getVia_administracao() {
        return via_administracao;
    }

    public void setVia_administracao(String via_administracao) {
        this.via_administracao = via_administracao;
    }

    public String getModoUso() {
        return modoUso;
    }

    public void setModoUso(String modoUso) {
        this.modoUso = modoUso;
    }

    public String getFormaDiluicao() {
        return formaDiluicao;
    }

    public void setFormaDiluicao(String formaDiluicao) {
        this.formaDiluicao = formaDiluicao;
    }

    public String getCuidadosEnfermagem() {
        return cuidadosEnfermagem;
    }

    public void setCuidadosEnfermagem(String cuidadosEnfermagem) {
        this.cuidadosEnfermagem = cuidadosEnfermagem;
    }

     public void descrever (){
        System.out.println("Nome do medicamento: " + nome);
        System.out.println("Classe do medicamento: " + classe);
        System.out.println("Indicações: " + indicacoes);
        System.out.println("Via de Administração: " + via_administracao);
        System.out.println("Modo de uso: " + modoUso);
        System.out.println("Forma de diluição: " + formaDiluicao);
        System.out.println("Cuidados de enfermagem: " + cuidadosEnfermagem );
    
        
     }
    
}
