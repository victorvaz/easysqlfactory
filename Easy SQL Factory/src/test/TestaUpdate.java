package test;

import EasySqlFactory.Update;

/**
 * Classe para testar a classe Update.
 * @author Victor Vaz <victor-vaz@hotmail.com>
 */
public class TestaUpdate
{
    public static void main(String[] args)
    {
        Update sql = new Update();
        sql.tabela = "USUARIO";
        sql.set.add("NOME = 'XUXA'");
        sql.where.add("CODIGO = 1");
        
        System.out.println(sql.create());
    }
}