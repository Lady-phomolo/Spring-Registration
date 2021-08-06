package iqb.online_registration.onlineregistrationapplication.Dao;

import iqb.online_registration.onlineregistrationapplication.entities.OnlineRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineRegistrationDao extends JpaRepository<OnlineRegistration,Long> {
}
