package workshop

import workshop.model.GraphInput
import workshop.model.GraphOutput
import workshop.model.GraphType

class Graph {

    val graphData: Map<GraphInput, GraphOutput> = mapOf(
            Pair(GraphInput("EntertainmentPass", GraphType.QUEUED), GraphOutput("SkyEntertainment")),
            Pair(GraphInput("NewsPass", GraphType.ACTIVATED), GraphOutput("SkyNews")))

    fun evaluate(inputs: List<GraphInput>): List<GraphOutput> {
        return graphData.filter { inputs.contains(it.key) }.map { it.value }
    }

}