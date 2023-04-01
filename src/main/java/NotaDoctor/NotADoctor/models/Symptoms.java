package NotaDoctor.NotADoctor.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Symptoms {
    @Id
    @GeneratedValue
    public Long id;
    public String symptomsName;

    public Symptoms(){

    }

    public Symptoms(Long id, String symptomsName){
        this.id = id;
        this.symptomsName = symptomsName;
    }

    public Long getId(){
        return id;
    }
    public String getSymptomsName(){
        return symptomsName;
    }
}
