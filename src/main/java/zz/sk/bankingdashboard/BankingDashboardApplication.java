package zz.sk.bankingdashboard;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = {"zz.sk.bankingdashboard.Entities"})
@ComponentScan(basePackages = {"zz.sk.bankingdashboard.Controllers", "zz.sk.bankingdashboard.Configuration","zz.sk.bankingdashboard.Repositories","zz.sk.bankingdashboard.Services"})
public class BankingDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankingDashboardApplication.class, args);
    }
}
