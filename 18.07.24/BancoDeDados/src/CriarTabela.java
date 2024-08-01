import java.sql.*;

public class CriarTabela {

public static void main(String[] args) throws SQLException {
    
    try {
    Connection conexao = MySQLConector.conectar();
    String strSqlCriarTabela = "create table `db_teste`.`tbl_teste` (`id` int not null auto_increment, `nome` varchar(255) not null, `email` varchar(255) not null, `senha` varchar(255) not null, primary key (`id`));";
    Statement stmSqlCriarBancoDeDados = conexao.createStatement();

   stmSqlCriarBancoDeDados.addBatch(strSqlCriarTabela);
   stmSqlCriarBancoDeDados.executeBatch();
   stmSqlCriarBancoDeDados.close();
   
    System.out.println("Tabela Criada Com Sucesso");

    } catch (Exception e) {
        System.out.println("Ops! ocorreu um erro:" + e);


}
}
}