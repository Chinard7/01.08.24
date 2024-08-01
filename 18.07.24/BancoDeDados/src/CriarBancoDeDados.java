import java.sql.*;

public class CriarBancoDeDados {

public static void main(String[] args) throws SQLException {
    
    try {
    Connection conexao = MySQLConector.conectar();
    String strSqlCriarBancoDeDados = "create database `db_teste`;";
    Statement stmSqlCriarBancoDeDados = conexao.createStatement();
   
   stmSqlCriarBancoDeDados.addBatch(strSqlCriarBancoDeDados);
   stmSqlCriarBancoDeDados.executeBatch();

   stmSqlCriarBancoDeDados.close();
   
    System.out.println("Banco De dados criado com sucesso");

    } catch (Exception e) {
        System.out.println("Ops! ocorreu um erro:" + e);


}
}
}