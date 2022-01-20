package com.github.noahcodegg.mockdata.services

import com.intellij.openapi.project.Project
import com.github.noahcodegg.mockdata.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
