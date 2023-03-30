package be.vdab.welkom.repositories;

import be.vdab.welkom.domain.Land;
import be.vdab.welkom.exceptions.RepositoryException;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Component
public class LandRepository {
    public List<Land> findAll() {
        try (var stream = Files.lines(Path.of("/data/landen.csv"))) {
            return stream
                    .map(regel -> regel.split(",")) // regel splitsen in zijn onderdelen
                    .map(regelOnderdelen -> // Land object maken met die onderdelen
                            new Land(regelOnderdelen[0], // landcode
                                    regelOnderdelen[1], // naam
                                    Integer.parseInt(regelOnderdelen[2]))) // oppervlakte
                    .toList(); // een List maken op basis van de stream
        } catch (IOException | ArrayIndexOutOfBoundsException |
                 NumberFormatException ex) {
            throw new RepositoryException(ex);
        }
    }
    }


