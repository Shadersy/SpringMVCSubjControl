package ru.gvozdilin.springcourse.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.gvozdilin.springcourse.dao.*;
import ru.gvozdilin.springcourse.service.*;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    @Bean
    public JdbcTemplate getJdbcTemplate(){
       return new JdbcTemplate(getDataSource());

    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/vebinar?serverTimezone=UTC");
        dataSource.setUsername("stas");
        dataSource.setPassword("stas");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");

        return dataSource;
    }

    @Bean
    public UserDao getUserDao(){
        return new UserDaoImpl(getJdbcTemplate());
    }

    @Bean
    public ProductDao getProductDao(){ return new ProductDaoImpl(getJdbcTemplate());}

    @Bean
    public PurchaseDao getPurchaseDao(){ return new PurchaseDaoImpl(getJdbcTemplate());
    }




    @Bean
    public UserService getUserService(){
        return new UserServiceImpl();
    }



    @Bean
    ProductService getProductService(){return new ProductServiceImpl(); }



    @Bean
    PurchaseService getPurchaseService(){return new PurchaseServiceImpl();
    }
}
