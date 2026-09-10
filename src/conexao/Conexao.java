package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
     private Connection conn;

    public Connection getConexao() {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/medicamentos ", // linha de conexao
                    "root", // usuario do mysql
                    "83933D&f97"// senha do mysql
            );
            System.out.println(" Conexão com o banco de dados realizado com sucesso. ");
            return conn;

        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }
        
    }
    
    public void desconectar() {
    try {
        if (conn != null && !conn.isClosed()) {
            conn.close();
            System.out.println("Conexão encerrada com sucesso!");
        }
    } catch (SQLException e) {
        System.out.println("Erro ao desconectar: " + e.getMessage());
    }
}

}
