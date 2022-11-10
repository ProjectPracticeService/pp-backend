package ru.mephi.pp.repo

import org.springframework.data.jpa.repository.JpaRepository
import ru.mephi.pp.models.project.PortfolioProject
import ru.mephi.pp.models.user.Admin
import ru.mephi.pp.models.user.Student

interface PortfolioProjectRepo:JpaRepository <PortfolioProject, Long>