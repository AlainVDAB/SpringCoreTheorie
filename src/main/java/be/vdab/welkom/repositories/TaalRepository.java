package be.vdab.welkom.repositories;

import be.vdab.welkom.domain.Taal;

import java.util.List;

public interface TaalRepository {
    List<Taal> findAll();
}
