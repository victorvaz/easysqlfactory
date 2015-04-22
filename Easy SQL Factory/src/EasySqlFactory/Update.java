package EasySqlFactory;

import java.util.ArrayList;
import java.util.List;
import org.jsoup.helper.StringUtil;

/**
 * Classe para criar um update dinamicamente.
 * @author Victor Vaz <victor-vaz@hotmail.com>
 */
public class Update implements Query
{
    /**
     * Tabela do update.
     */
    public String tabela;
    
    /**
     * Alterações.
     */
    public List<String> set = new ArrayList<>();
    
    /**
     * Condições da busca.
     */
    public List<String> where = new ArrayList<>();

    /**
     * Cria a sql de acordo com os parâmetros.
     * @return String sql criada.
     */
    @Override
    public String create()
    {
        // Lista de set:
        String sqlSet = " SET " + StringUtil.join(set, ",\n ");
        
        // Lista de condições:
        String sqlCondicoes = " WHERE " + StringUtil.join(where, " \n AND ");
        
        String sqlFull = "UPDATE " + tabela + " \n " + sqlSet + " \n " + sqlCondicoes;
        
        return sqlFull;
    }
}