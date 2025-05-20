package kata10

class DocumentFolder(private val name: String) : DocumentComponent {
    private val files = mutableListOf<DocumentComponent>()

    fun add(document: DocumentComponent) {
        files.add(document)
    }

    override fun getSize(): Int {
        return files.sumOf { fs -> fs.getSize() }
    }

    override fun showDetails() {
        files.forEach(DocumentComponent::showDetails)
        println("Carpeta: $name, Tamaño total: ${getSize()} MB")
    }
}