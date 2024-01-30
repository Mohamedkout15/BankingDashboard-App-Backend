package zz.sk.bankingdashboard.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import zz.sk.bankingdashboard.Entities.Client;
import zz.sk.bankingdashboard.Entities.PremiereVisite;

import java.util.Date;
import java.util.Optional;

public interface PremiereVisiteRepository  extends JpaRepository<PremiereVisite, Long> {
    @Override
    Optional<PremiereVisite> findById(Long aLong);
    PremiereVisite findPremiereVisiteByDatePrVisite(Date date);
    PremiereVisite findPremiereVisiteByDatePrVisiteAfter(Date date);
    PremiereVisite findPremiereVisiteByDatePrVisiteBefore(Date date);
    PremiereVisite findPremiereVisiteByDatePrVisiteBetween(Date date1,Date date2);

}
