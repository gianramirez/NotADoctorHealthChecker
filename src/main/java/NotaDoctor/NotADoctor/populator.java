package NotaDoctor.NotADoctor;

import NotaDoctor.NotADoctor.models.Symptoms;
import NotaDoctor.NotADoctor.repositories.SymptomsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class populator implements CommandLineRunner {
    @Resource
    public SymptomsRepository symptomsRepo;

    @Override
    public void run(String... args) throws Exception {

        Symptoms Cold = new Symptoms(1L, "Cold");
        symptomsRepo.save(Cold);
        Symptoms Cough = new Symptoms(2L, "Cough");
        symptomsRepo.save(Cough);
        Symptoms Diarrhea = new Symptoms(3L, "Diarrhea");
        symptomsRepo.save(Diarrhea);
        Symptoms BodyAches = new Symptoms(4L, "Body Aches");
        symptomsRepo.save(BodyAches);
        Symptoms Headache = new Symptoms(5L, "Headache");
        symptomsRepo.save(Headache);
        Symptoms Nausea = new Symptoms(6L, "Nausea");
        symptomsRepo.save(Nausea);
        Symptoms Constipation = new Symptoms(7L, "Constipation");
        symptomsRepo.save(Constipation);
        Symptoms Fever = new Symptoms(8L, "Fever");
        symptomsRepo.save(Fever);
        Symptoms Dizzyness = new Symptoms(9L, "Dizzyness");
        symptomsRepo.save(Dizzyness);
        Symptoms Cramping = new Symptoms(10L, "Cramping");
    }

}
