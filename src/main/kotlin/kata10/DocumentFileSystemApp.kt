package kata10

class DocumentFileSystemApp {
    fun showDetails() {
        val document1 = Document("Informe.docx", 5)
        val document2 = Document("Presentación.pptx", 10)
        val documentFolder = DocumentFolder("Proyectos")

        documentFolder.add(document1)
        documentFolder.add(document2)

        documentFolder.showDetails()
    }
}