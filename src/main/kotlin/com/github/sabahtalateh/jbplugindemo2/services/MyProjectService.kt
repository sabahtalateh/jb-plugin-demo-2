package com.github.sabahtalateh.jbplugindemo2.services

import com.github.sabahtalateh.jbplugindemo2.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
