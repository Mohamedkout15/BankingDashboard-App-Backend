package zz.sk.bankingdashboard.DataSource;

import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .url("jdbc:mysql://localhost:3306/BankingDashboard?createDatabaseIfNotExist=true")
                .username("root")
                .password("")
                .build();
    }
}