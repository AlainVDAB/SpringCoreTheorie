package be.vdab.welkom.repositories;

import be.vdab.welkom.domain.Taal;
import be.vdab.welkom.exceptions.RepositoryException;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Component
public class TaalRepository {
    public List<Taal> findAll(){
        try(var stream = Files.lines(Path.of("/data/talen.csv"))){
            return stream
                    .map(regel -> regel.split(",")) // regel opsplitsen in zijn onderdelen
                    .map(regelOnderdelen -> // Taal object maken met die onderdelen
                            new Taal(regelOnderdelen[0], // taalcode
                                    regelOnderdelen[1])) // naam
                    .toList();
        } catch (IOException | ArrayIndexOutOfBoundsException |
                 NumberFormatException ex) {
            throw new RepositoryException(ex);
        }
    }
}
