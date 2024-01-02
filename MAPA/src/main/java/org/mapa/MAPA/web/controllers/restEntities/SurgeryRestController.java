package org.mapa.MAPA.web.controllers.restEntities;

import org.mapa.MAPA.domain.surgery.Surgery;
import org.mapa.MAPA.services.BaseService;
import org.mapa.MAPA.services.SurgeryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/surgery")
public class SurgeryRestController extends BaseRestController<Surgery> {

    @Autowired
    private SurgeryService surgeryService;

    @Override
    protected BaseService getService() {
        return this.surgeryService;
    }
}
