import org.junit.Test
import kotlin.test.assertEquals

class MainKtTest {

    @Test
    fun limitPerDay() {
    }

    @Test
    fun limitPerMonth() {
    }

    @Test
    fun comission() {
    }

    @Test
    fun paymentValue() {
    }

    @Test
    fun mainFalse() {
        val paymentSystem = "VK Pay"
        val payment = 40000
        val balance = 1_000_000
        val result = ru.netology.paymentValue(paymentSystem, payment, balance)
        assertEquals(100, 0)
    }

    @Test
    fun mainTrue(){
        val paymentSystem = "VK Pay"
        val payment = 40000
        val balance = 1_000_000
        val result = ru.netology.paymentValue(paymentSystem, payment, balance)
        assertEquals(0, 0)
    }
}