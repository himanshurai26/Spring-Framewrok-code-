
package com.spring.MainJdbc;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author Himanshu Kumar
 */

@Configuration
@ComponentScan(basePackages={"com.spring.jdbc.dao"})
public class JdbcConfig {
    
    @Bean("db1")
    public DriverManagerDataSource getDataSource()
    {
        DriverManagerDataSource db1 = new DriverManagerDataSource();
       db1.setDriverClassName("com.mysql.cj.jdbc.Driver");
       db1.setUrl("jdbc:mysql://localhost:3306/springjdbc");
       db1.setUsername("root");
       db1.setPassword("26112002");
       
       return db1;
    }
    @Bean("jdbcTemplate")
    public JdbcTemplate getTemplate(){
      JdbcTemplate jdbcTemplate = new JdbcTemplate();
   
      jdbcTemplate.setDataSource(getDataSource());
      
      return jdbcTemplate;
    
    }
    
   /* @Bean("customerDao")
    public customerDao getCustomerDao(){
        CustomerDaoImp customerDao = new CustomerDaoImp();
   
        customerDao.setJdbcTemplate(getTemplate());
        
        return customerDao;
    
    now this part is done by using autowiring
    
   
    } */
}
