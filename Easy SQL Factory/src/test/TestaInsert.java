package test;

import EasySqlFactory.Insert;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe para testar a classe de Insert
 * @author Victor Vaz <victor-vaz@hotmail.com>
 */
public class TestaInsert
{
    public static void main (String[] args)
    {
        Insert sql = new Insert();
        sql.tabela = "USUARIO";
        sql.campos.add("CODIGO");
        sql.campos.add("NOME");
        sql.campos.add("STATUS");
        
        List<String> ListaUsuario1 = new ArrayList<>();
        ListaUsuario1.add("1");
        ListaUsuario1.add("'Victor'");
        ListaUsuario1.add("2");
        sql.valores.add(ListaUsuario1);
        
        List<String> ListaUsuario2 = new ArrayList<>();
        ListaUsuario2.add("2");
        ListaUsuario2.add("'Vaz'");
        ListaUsuario2.add("1");
        sql.valores.add(ListaUsuario2);
        
        System.out.println(sql.create());
    }
}