package com.github.alexpl292.bookmarktest.services

import com.intellij.openapi.project.Project
import com.github.alexpl292.bookmarktest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
