package examplesv2.a4unittesting

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test

class ServiceTest {

    //TODO: Show Java Example

    lateinit var serviceExecutor: ServiceExecutor

    @Before
    fun before() {
        serviceExecutor = ServiceExecutor()
    }

    @Test
    fun `Service executor returns true if it was succesful`() {
        val serviceExecutorResult = serviceExecutor.execute(Service())

        assertThat(serviceExecutorResult).isTrue()
    }

    @Test
    fun `Service executor should, suprisingly, execute service`() {
        val service: Service = mockk<Service>() // can be relaxed
        every { service.execute(0) } returns true //What happens if I'm commented out?

        val serviceExecutorResult = serviceExecutor.execute(service)

        assertThat(serviceExecutorResult).isTrue()

        verify {
            service.execute(0)
        }
    }

    @Test
    fun `Service executor should execute service x num of times`() {
        val service: Service = mockk()
        every { service.execute(more(0, true)) } returns true

        val serviceExecutorResult = serviceExecutor.execute(service, 3)

        assertThat(serviceExecutorResult).isTrue()

        verify {
            service.execute(2)
            service.execute(0)
            service.execute(1)
        }
    }


    /**
     * There are basically four types of verification supported: unordered, ordered, sequential and all.
     */
}
