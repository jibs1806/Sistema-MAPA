package org.mapa.MAPA.web.controllers.rest.surgery;

import org.mapa.MAPA.domain.surgery.Centre;
import org.mapa.MAPA.services.BaseService;
import org.mapa.MAPA.services.surgery.CentreService;
import org.mapa.MAPA.web.controllers.rest.BaseRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest/centre")
public class CentreRestController extends BaseRestController<Centre> {

    @Autowired
    private CentreService centreService;

    @Override
    protected BaseService getService() {
        return this.centreService;
    }
}
