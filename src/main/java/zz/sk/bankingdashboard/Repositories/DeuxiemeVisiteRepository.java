package zz.sk.bankingdashboard.Repositories;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import zz.sk.bankingdashboard.Entities.Client;
import zz.sk.bankingdashboard.Entities.DeuxiemeVisite;
import zz.sk.bankingdashboard.Entities.PremiereVisite;

import java.util.Date;
import java.util.Optional;

public interface DeuxiemeVisiteRepository  extends JpaRepository<DeuxiemeVisite, Long> {

    @Override
    Optional<DeuxiemeVisite> findById(Long aLong);


    DeuxiemeVisite findDeuxiemeVisiteByDateDxVisite(Date date);
    DeuxiemeVisite findDeuxiemeVisiteByDateDxVisiteAfter(Date date);
    DeuxiemeVisite findDeuxiemeVisiteByDateDxVisiteBefore(Date date);
    DeuxiemeVisite findDeuxiemeVisiteByDateDxVisiteBetween(Date date1,Date date2);}
