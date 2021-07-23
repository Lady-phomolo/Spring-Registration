package iqb.online_registration.onlineregistrationapplication.controller;

import iqb.online_registration.onlineregistrationapplication.model.OnlineRegistrationModel;
import iqb.online_registration.onlineregistrationapplication.service.OnlineRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins ="http://localhost:4200", allowedHeaders = "*")
public class OnlineRegistrationController {


    @Autowired()
    private OnlineRegistrationService onlineRegistrationService;

    @RequestMapping(method = RequestMethod.GET, value = "/list")
    public List<OnlineRegistrationModel> onlineRegistrationModelList() {
        return onlineRegistrationService.onlineRegistrationList();
    }

    @RequestMapping(value = "/list/{id}")
    public OnlineRegistrationModel findById(@PathVariable Long id) {
        return onlineRegistrationService.findOnlineRegistrationById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public OnlineRegistrationModel addOnlineRegistration(@RequestBody OnlineRegistrationModel onlineRegistration) {
        return  onlineRegistrationService.addOnlineRegistration(onlineRegistration);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/update")
    public OnlineRegistrationModel updateOnlineRegistration(@RequestBody OnlineRegistrationModel onlineRegistration) {
        return onlineRegistrationService.addOnlineRegistration(onlineRegistration);

    }


}
