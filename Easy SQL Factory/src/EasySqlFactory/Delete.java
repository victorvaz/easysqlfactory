package EasySqlFactory;

import java.util.ArrayList;
import java.util.List;
import org.jsoup.helper.StringUtil;

/**
 * Classe para criar um select dinamicamente.
 * @author Victor Vaz <victor-vaz@hotmail.com>
 */
public class Delete implements Query
{
    /**
     * Tabela da query
     */
    public String tabela;
    
    /**
     * Condições da query.
     */
    public List<String> where = new ArrayList<>();

    /**
     * Cria a sql de acordo com os parâmetros.
     * @return String sql criada.
     */
    @Override
    public String create()
    {
        // Lista de condições:
        String sqlCondicoes = " WHERE " + StringUtil.join(where, " \n AND ");
        
        String sqlFull = "DELETE FROM " + tabela + " \n " + sqlCondicoes;
        
        return sqlFull;
    }
}