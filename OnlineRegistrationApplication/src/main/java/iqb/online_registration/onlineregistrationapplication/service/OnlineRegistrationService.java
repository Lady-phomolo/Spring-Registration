package iqb.online_registration.onlineregistrationapplication.service;

import iqb.online_registration.onlineregistrationapplication.model.OnlineRegistrationModel;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OnlineRegistrationService {

    List<OnlineRegistrationModel> onlineRegistrationList();
    OnlineRegistrationModel findOnlineRegistrationById(Long id);
    OnlineRegistrationModel addOnlineRegistration(OnlineRegistrationModel onlineRegistrationModel);
    OnlineRegistrationModel updateOnlineRegistration(OnlineRegistrationModel onlineRegistrationModel);
}
