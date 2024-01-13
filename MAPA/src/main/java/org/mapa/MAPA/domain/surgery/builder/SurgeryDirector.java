package org.mapa.MAPA.domain.surgery.builder;

import org.mapa.MAPA.domain.surgery.ParamSurgery;
import org.mapa.MAPA.domain.surgery.Surgery;

public class SurgeryDirector {
    private SurgeryBuilder surgeryBuilder = new SurgeryBuilder();

    public Surgery buildSurgery(ParamSurgery paramSurgery){
        return this.surgeryBuilder.initializeAttributes().
                setParamSurgery(paramSurgery).finishSurgeryDetail().
                assignFees().build();
    }

    public SurgeryDirector() {
    }
}
