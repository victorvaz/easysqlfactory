package test;

import EasySqlFactory.Delete;

/**
 * Classe para testar a classe de delete
 * @author Victor Vaz <victor-vaz@hotmail.com>
 */
public class TestaDelete
{
    public static void main(String[] args)
    {
        Delete sql = new Delete();
        sql.tabela = "USUARIO";
        sql.where.add("CODIGO = 1");
        
        System.out.println(sql.create());
    }
}