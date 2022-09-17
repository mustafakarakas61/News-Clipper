package com.mustafa.newsclipper.config;

import com.mustafa.newsclipper.utils.JdbcOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Objects;

@Configuration
public class DatabaseConfig {

    @Bean("jdbcOperatorPostgreBcClipper")
    public JdbcOperator jdbcOperatorPostgreBcClipper(DataSource dataSource) {
        JdbcOperator op = new JdbcOperator(dataSource);
        op.setIsPostgre(true);
        return op;
    }
}
