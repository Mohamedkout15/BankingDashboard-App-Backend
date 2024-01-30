package zz.sk.bankingdashboard.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import zz.sk.bankingdashboard.Entities.Client;
import zz.sk.bankingdashboard.Entities.PremiereVisite;

import java.util.List;
import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findClientByIdClient(String idClient);
    List<Client> findClientByPremiereVisite(PremiereVisite premiereVisite);
    List<Client> findClientsByDomaine(String Domaine);
}
