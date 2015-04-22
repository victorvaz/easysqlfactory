package EasySqlFactory;

/**
 * Interface para implementação de querys
 * @author Victor Vaz <victor-vaz@hotmail.com>
 */
public interface Query
{
    /**
     * Cria a sql
     * @return Sql pronta.
     */
    public String create();
}