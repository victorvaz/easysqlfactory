package EasySqlFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jsoup.helper.StringUtil;

/**
 * Classe para criar um select dinamicamente.
 * @author Victor Vaz <victor-vaz@hotmail.com>
 */
public class Select
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
    public String createSelect()
    {
        // Lista de selects:
        String sqlSelect = " SELECT " + StringUtil.join(Arrays.asList(select.toArray(new String[select.size()])), ",\n ");
        
        // Lista de from:
        String sqlFrom = " FROM " + StringUtil.join(Arrays.asList(from.toArray(new String[from.size()])), ", ");
        
        // Lista de Inner Join:
        String sqlInnerJoin = StringUtil.join(Arrays.asList(join.toArray(new String[join.size()])), " \n ");
        
        // Lista de Condições:
        String sqlCondicoes = "";
        if (where.size() > 0)
        {
            sqlCondicoes = " WHERE " + StringUtil.join(Arrays.asList(where.toArray(new String[where.size()])), " \n AND ");
        }
        
        // Lista de Ordenação:
        String sqlOrdemBy = "";
        if (orderBy.size() > 0)
        {
            sqlOrdemBy = " ORDER BY " + StringUtil.join(Arrays.asList(orderBy.toArray(new String[orderBy.size()])), ",\n ");
        }
        
        String sqlFull = sqlSelect + " \n " + sqlFrom + " \n " + sqlInnerJoin + " \n " + sqlCondicoes + " \n " + sqlOrdemBy;
        
        return sqlFull;
    }
}