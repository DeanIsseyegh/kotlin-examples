package examplesv2.a4unittesting

import java.lang.RuntimeException

class ServiceExecutor {

    fun execute(service: Service, numOfTimes: Int = 1): Boolean {
        var didAnyFail = false

        repeat(numOfTimes) { i ->
            val isSuccess = service.execute(i)
            if (!isSuccess) didAnyFail = true
        }

        return !didAnyFail
    }

}
