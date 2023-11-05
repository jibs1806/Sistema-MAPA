package domain.surgery.paramSurgery;

import domain.surgery.fees.MemberBasedFee;
import domain.people.Person;
import domain.surgery.practice.Practice;
import lombok.Setter;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter @Setter
public class ParamSurgery {
    private String detail;
    private Practice practice;
    private LocalDateTime completionDate;
    private List<Person> members;
    private List<MemberBasedFee> memberBasedFees;
    private Person chiefSurgery;

    public ParamSurgery(){
        
    }
}
