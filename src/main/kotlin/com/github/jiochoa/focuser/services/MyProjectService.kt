package com.github.jiochoa.focuser.services

import com.intellij.openapi.project.Project
import com.github.jiochoa.focuser.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
