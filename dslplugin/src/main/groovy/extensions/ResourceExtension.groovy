package extensions

class ResourceExtension extends OperationExtension {

    File outputFile

    ResourceExtension(String name) {
        super(name)
    }

    void setOutputFile(String file) {
        outputFile = new File(file)
    }

    void outputFile(String file) {
        setOutputFile(file)
    }
}