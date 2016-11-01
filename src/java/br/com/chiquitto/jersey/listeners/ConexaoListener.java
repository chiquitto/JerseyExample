package br.com.chiquitto.jersey.listeners;

import br.com.chiquitto.aula.jdbcescola.Conexao;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ConexaoListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Conexao.setUrl("jdbc:sqlite:/Users/chiquitto/work/JerseyExample/data/escola.sqlite.db");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
    
}
