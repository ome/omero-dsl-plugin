package extensions

import org.gradle.api.Project
import org.gradle.api.file.FileCollection

class DslExtension {
    final Project project

    FileCollection mappingFiles

    FileCollection templateFiles

    File outputPath

    void templateFiles(FileCollection files) {
        if (templateFiles) {
            templateFiles = templateFiles + files
        } else {
            templateFiles = files
        }
    }

    void mappingFiles(FileCollection files) {
        if (mappingFiles) {
            mappingFiles = mappingFiles + files
        } else {
            mappingFiles = files
        }
    }

    void setOutputPath(String path) {
        setOutputPath(new File(path))
    }

    void setOutputPath(File path) {
        if (!path.isAbsolute()) {
            outputPath = project.file(path)
        } else {
            outputPath = path
        }
    }

    void outputPath(String path) {
        setOutputPath(path)
    }

    DslExtension(Project project) {
        this.project = project
    }
}
