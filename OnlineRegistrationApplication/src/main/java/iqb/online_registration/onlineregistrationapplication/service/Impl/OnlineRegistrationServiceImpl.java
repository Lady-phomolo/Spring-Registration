package iqb.online_registration.onlineregistrationapplication.service.Impl;

import iqb.online_registration.onlineregistrationapplication.Dao.OnlineRegistrationDao;
import iqb.online_registration.onlineregistrationapplication.entities.OnlineRegistration;
import iqb.online_registration.onlineregistrationapplication.model.OnlineRegistrationModel;
import iqb.online_registration.onlineregistrationapplication.service.OnlineRegistrationService;
import iqb.online_registration.onlineregistrationapplication.transformer.OnlineRegistrationTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OnlineRegistrationServiceImpl implements OnlineRegistrationService {

    @Autowired
    OnlineRegistrationDao onlineRegistrationDao;

    @Autowired
    OnlineRegistrationTransformer onlineRegistrationTransformer;

    @Override
    public List<OnlineRegistrationModel> onlineRegistrationList() {
        return onlineRegistrationTransformer.toModels(onlineRegistrationDao.findAll());
    }

    @Override
    public OnlineRegistrationModel findOnlineRegistrationById(Long id) {
        return onlineRegistrationTransformer.toModel(onlineRegistrationDao.findById(id).get());
    }

    @Override
    public OnlineRegistrationModel addOnlineRegistration(OnlineRegistrationModel onlineRegistrationModel) {
        OnlineRegistration onlineRegistration = new OnlineRegistration();
        onlineRegistrationTransformer.fillFromModel(onlineRegistration,onlineRegistrationModel);
        onlineRegistration = onlineRegistrationDao.save(onlineRegistration);
        return onlineRegistrationTransformer.toModel(onlineRegistration);
    }

    @Override
    public OnlineRegistrationModel updateOnlineRegistration(OnlineRegistrationModel onlineRegistrationModel) {

        OnlineRegistration onlineRegistration = new OnlineRegistration();
        onlineRegistrationTransformer.fillFromModel(onlineRegistration, onlineRegistrationModel);
        onlineRegistration = onlineRegistrationDao.save(onlineRegistration);
        return onlineRegistrationTransformer.toModel(onlineRegistration);
    }
}
