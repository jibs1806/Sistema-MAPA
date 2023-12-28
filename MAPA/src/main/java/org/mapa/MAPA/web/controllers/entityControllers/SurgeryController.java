package org.mapa.MAPA.web.controllers.entityControllers;

import org.mapa.MAPA.domain.surgery.Surgery;
import org.mapa.MAPA.services.BaseService;
import org.mapa.MAPA.services.SurgeryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/surgery")
public class SurgeryController extends BaseController<Surgery> {

    @Autowired
    private SurgeryService surgeryService;
    @Override
    protected BaseService<Surgery> getService() {
        return surgeryService;
    }
}
