package com.github.spiegela.intellijconcourseci.services

import com.intellij.openapi.project.Project
import com.github.spiegela.intellijconcourseci.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
