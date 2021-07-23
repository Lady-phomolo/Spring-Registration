package iqb.online_registration.onlineregistrationapplication.transformer;

import iqb.online_registration.onlineregistrationapplication.entities.OnlineRegistration;
import iqb.online_registration.onlineregistrationapplication.model.OnlineRegistrationModel;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Component
public class OnlineRegistrationTransformer {

    public OnlineRegistrationModel toModel(OnlineRegistration entity) {
        OnlineRegistrationModel model = new OnlineRegistrationModel();
        if (entity != null) {
            model.setId(entity.getId());
            model.setFirstName(entity.getFirstName());
            model.setLastName(entity.getLastName());
            model.setIdNumber(entity.getIdNumber());

        }
        return model;
    }

    public List<OnlineRegistrationModel> toModels(List<OnlineRegistration> entities) {
        List<OnlineRegistrationModel> models = Collections.emptyList();
        if (entities != null) {
            models = new ArrayList<>();
            for (OnlineRegistration onlineRegistration : entities) {
                models.add(toModel(onlineRegistration));
            }
        }
        return models;
    }

    public void fillFromModel(OnlineRegistration entity, OnlineRegistrationModel model) {

        if (entity != null && model != null) {
            entity.setId(model.getId());
            entity.setFirstName(model.getFirstName());
            entity.setLastName(model.getLastName());
            entity.setIdNumber(model.getIdNumber());
        }
    }




}
