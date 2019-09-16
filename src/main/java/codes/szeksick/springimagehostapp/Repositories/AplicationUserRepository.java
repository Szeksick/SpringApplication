package codes.szeksick.springimagehostapp.Repositories;

import codes.szeksick.springimagehostapp.model.AplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AplicationUserRepository extends JpaRepository<AplicationUser, Long> {

    AplicationUser findUserByname(String username);
}
