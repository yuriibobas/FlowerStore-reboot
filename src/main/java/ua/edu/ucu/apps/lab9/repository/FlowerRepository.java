package ua.edu.ucu.apps.lab9.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.edu.ucu.apps.lab9.model.Flower;

public interface FlowerRepository extends JpaRepository<Flower, Integer>{

}
