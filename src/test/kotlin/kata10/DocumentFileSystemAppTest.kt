package kata10

import org.junit.jupiter.api.Test

internal class DocumentFileSystemAppTest {
    @Test
    fun print() {
        val fileExplorerApp = DocumentFileSystemApp()
        fileExplorerApp.showDetails()
    }
}