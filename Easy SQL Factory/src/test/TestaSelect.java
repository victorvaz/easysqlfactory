package test;

import EasySqlFactory.Select;

/**
 * Classe para testar a classe de Select
 * @author Victor Vaz <victor-vaz@hotmail.com>
 */
public class TestaSelect
{
    public static void main (String[] args)
    {
        Select sql = new Select();
        sql.select.add("U.CODIGO");
        sql.select.add("U.NOME");
        sql.select.add("T.DESCRICAO");
        sql.from.add("USUARIO U");
        sql.join.add("INNER JOIN TIPO_USUARIO T ON U.COD_TIPO = T.COD_TIPO");
        sql.where.add("U.STATUS = 1");
        sql.orderBy.add("U.NOME");
        
        System.out.println(sql.create());
    }
}