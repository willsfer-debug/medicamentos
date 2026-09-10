package dao;

import beans.medicamentos;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class medicamentosDAO {

    
    // Criando conexão com banco do dados.
    private Conexao conexao;
    private Connection conn;

    public medicamentosDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    
    // Inserindo dados no banco de dados 
    public void inserir(medicamentos medicamentos) {

        String sql = "INSERT INTO medicamentos "
                + "(id, nome, classe, indicacoes, via_administracao, modo_uso, forma_diluicao, cuidados_enfermagem) "
                + "VALUES (?,?,?,?,?,?,?)";

        try {

            PreparedStatement stmt = this.conn.prepareStatement(sql);

            stmt.setString(1, medicamentos.getNome());
            stmt.setString(2, medicamentos.getClasse());
            stmt.setString(3, medicamentos.getIndicacoes());
            stmt.setString(4, medicamentos.getVia_administracao());
            stmt.setString(5, medicamentos.getModoUso());
            stmt.setString(6, medicamentos.getFormaDiluicao());
            stmt.setString(7, medicamentos.getCuidadosEnfermagem());

            stmt.executeUpdate();

            System.out.println("Medicamento cadastrado com sucesso!");

            stmt.close();

        } catch (Exception e) {

            System.out.println(
                    "Erro ao inserir medicamento ao banco de dados: "
                    + e.getMessage()
            );

        }

    }
   
   public List<medicamentos> getmedicamentos() {
    
    List<medicamentos> lista = new ArrayList<>();

    String sql = "SELECT * FROM medicamentos";

    try {
        PreparedStatement stmt = conn.prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {

            medicamentos m = new medicamentos();

            m.setNome(rs.getString("nome"));
            m.setClasse(rs.getString("classe"));
            m.setIndicacoes(rs.getString("indicacoes"));
            m.setVia_administracao(rs.getString("via_administracao"));
            m.setModoUso(rs.getString("modoUso"));
            m.setFormaDiluicao(rs.getString("formaDiluicao"));
            m.setCuidadosEnfermagem(rs.getString("cuidadosEnfermagem"));

            lista.add(m);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return lista;
}
    
    
    //Excluir no banco de dados
    public void excluir (int id){
        String sql = "DELETE FROM medicamentos WHERE id = ?";
        
        try {
                    PreparedStatement stmt = this.conn.prepareStatement(sql);
                    stmt.setInt(1, id);
                    stmt.execute();       
                } catch (Exception e) {
                    System.out.println("Erro ao excluir medicamento: " + e.getMessage());
                }
    }
}
