package be.vdab.welkom.console;

import be.vdab.welkom.exceptions.RepositoryException;
import be.vdab.welkom.repositories.LandRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    private final LandRepository landRepository;

    public MyRunner(LandRepository landRepository) {
        this.landRepository =landRepository;
    }

    @Override
    public void run(String... args){
    try {
        landRepository.findAll()
                .forEach(land -> System.out.println(land.getNaam()));
    } catch (RepositoryException ex){
        ex.printStackTrace(System.err);
    }
    }

}

