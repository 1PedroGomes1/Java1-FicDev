import java.sql.*;

public class MyConnection {
    public static void main(String[] args) {
     try {
         Class.forName("org.postgresql.Driver"); // Registra o Driver
         
         // Abre Conexão
         Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ficdatabase" , "postgres" , "123456");
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM escola"); // Executa comando SQL
         while (rs.next()) { // Manipula resultado
             int id = rs.getInt("idescola");
             String nome = rs.getString("nome");
             System.out.println(id + " | " + nome);
         }
         conn.close(); // fecha conexão
    }    catch (Exception e) {
    System.err.println("Erro: "+e.getMessage());   
}}}
