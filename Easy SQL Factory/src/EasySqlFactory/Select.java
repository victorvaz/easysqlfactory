package EasySqlFactory;

import java.util.ArrayList;
import java.util.List;
import org.jsoup.helper.StringUtil;

/**
 * Classe para criar um select dinamicamente.
 * @author Victor Vaz <victor-vaz@hotmail.com>
 */
public class Select implements Query
{
    /**
     * Selects da query.
     */
    public List<String> select = new ArrayList<>();
    
    /**
     * Tabela da query.
     */
    public List<String> from = new ArrayList<>();
    
    /**
     * Condições da query.
     */
    public List<String> where = new ArrayList<>();
    
    /**
     * Joins da query.
     */
    public List<String> join = new ArrayList<>();
    
    /**
     * Ordem de apresentação dos resultados.
     */
    public List<String> orderBy = new ArrayList<>();
    
    /**
     * Cria a sql de acordo com os parâmetros.
     * @return String sql criada.
     */
    @Override
    public String create()
    {
        // Lista de selects:
        String sqlSelect = " SELECT " + StringUtil.join(select, ",\n ");
        
        // Lista de from:
        String sqlFrom = " FROM " + StringUtil.join(from, ", ");
        
        // Lista de Inner Join:
        String sqlInnerJoin = StringUtil.join(join, " \n ");
        
        // Lista de Condições:
        String sqlCondicoes = "";
        if (where.size() > 0)
        {
            sqlCondicoes = " WHERE " + StringUtil.join(where, " \n AND ");
        }
        
        // Lista de Ordenação:
        String sqlOrdemBy = "";
        if (orderBy.size() > 0)
        {
            sqlOrdemBy = " ORDER BY " + StringUtil.join(orderBy, ",\n ");
        }
        
        String sqlFull = sqlSelect + " \n " + sqlFrom + " \n " + sqlInnerJoin + " \n " + sqlCondicoes + " \n " + sqlOrdemBy;
        
        return sqlFull;
    }
}