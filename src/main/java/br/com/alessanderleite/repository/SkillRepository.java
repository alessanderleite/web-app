package br.com.alessanderleite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alessanderleite.entity.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer>{}
