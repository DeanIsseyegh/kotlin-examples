package workshop.model

data class GraphInput(val name: String, val graphType: GraphType)

enum class GraphType {
    QUEUED, ACTIVATED
}