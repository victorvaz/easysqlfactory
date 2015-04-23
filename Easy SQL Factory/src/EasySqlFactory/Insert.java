package EasySqlFactory;

import java.util.ArrayList;
import java.util.List;
import org.jsoup.helper.StringUtil;

/**
 * Classe para criar um update dinamicamente.
 * @author Victor Vaz <victor-vaz@hotmail.com>
 */
public class Insert implements Query
{
    public String tabela;
    
    public List<String> campos = new ArrayList<>();
    
    public List<List<String>> valores = new ArrayList<>();

    /**
     * Cria a sql de acordo com os parâmetros.
     * @return String sql criada.
     */
    @Override
    public String create()
    {
        // Lista de campos:
        String sqlCampos = " (" + StringUtil.join(campos, ", ") + ") ";
        
        // Lista de valores:
        List<String> sqlSubValores = new ArrayList<>();
        for (int i = 0; i < valores.size(); i++)
        {
            List<String> listaValores = valores.get(i);
            sqlSubValores.add(" (" + StringUtil.join(listaValores, ", ") + ") ");
        }
        
        String sqlValores = StringUtil.join(sqlSubValores, ", ");
        
        String sqlFull = "INSERT INTO " + tabela + " " + sqlCampos + " VALUES " + sqlValores;
        
        return sqlFull;
    }
    
}