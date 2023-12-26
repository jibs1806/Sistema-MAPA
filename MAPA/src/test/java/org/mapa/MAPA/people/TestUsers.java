package org.mapa.MAPA.people;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import org.mapa.MAPA.domain.surgery.fees.MemberBasedFee;
import org.mapa.MAPA.domain.surgery.Surgery;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUsers {
    @Test
    @DisplayName("Checking if Lucho has been saved correctly")
    public void LuchoPersistenceTest(){
        Surgery surgery = new Surgery();
        MemberBasedFee memberBasedFee = new MemberBasedFee();

    }
}
