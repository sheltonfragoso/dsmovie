package com.sheltonfragoso.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sheltonfragoso.dsmovie.entities.Score;
import com.sheltonfragoso.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
