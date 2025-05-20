package kata10

class Document(private val name: String, private val size: Int) : DocumentComponent {

    override fun getSize(): Int {
        return size
    }

    override fun showDetails() {
        println("Documento: $name, Tamaño total: $size MB")
    }

}