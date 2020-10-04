package com.github.caojianluzhu000.gradleintellijplugintry.services

import com.intellij.openapi.project.Project
import com.github.caojianluzhu000.gradleintellijplugintry.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
