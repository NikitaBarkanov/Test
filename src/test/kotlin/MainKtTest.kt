import org.junit.Test
import ru.netology.paymentValue
import kotlin.test.assertEquals

class MainKtTest {

@Test
fun paymentValueLimPerDay(){
    val paymentSystem = "VK Pay"
    val payment = 50000
    val balance = 0

    val result = paymentValue(paymentSystem, payment, balance)
    assertEquals(0.0, result)
}
    @Test
    fun paymentValueLimPerDayWrong(){
        val paymentSystem = "null"
        val payment = 50000
        val balance = 0

        val result = paymentValue(paymentSystem, payment, balance)
        assertEquals(0.0, result)
    }

    @Test
    fun paymentValueLimPerMonth(){
        val paymentSystem = "VK Pay"
        val payment = 1000
        val balance = 39900

        val result = paymentValue(paymentSystem, payment, balance)
        assertEquals(0.0, result)
    }

    @Test
    fun paymentValueLimPerMonthWrong(){
        val paymentSystem = "null"
        val payment = 1000
        val balance = 39900

        val result = paymentValue(paymentSystem, payment, balance)
        assertEquals(0.0, result)
    }

    @Test
    fun comission(){
        val paymentSystem = "VK Pay"
        val payment = 10000
        val balance = 0

        val result = paymentValue(paymentSystem, payment, balance)
        assertEquals(10000.0, result)
    }

    @Test
    fun comissionMaes(){
        val paymentSystem = "Maestro"
        val payment = 74999
        val balance = 0
        val result = paymentValue(paymentSystem, payment, balance)
        assertEquals(74999.0, result)
    }
    @Test
    fun comissionMaster(){
        val paymentSystem = "Mastercard"
        val payment = 74999
        val balance = 0

        val result = paymentValue(paymentSystem, payment, balance)
        assertEquals(74999.0, result)
    }
    @Test
    fun comissionVisa(){
        val paymentSystem = "Visa"
        val payment = 1000
        val balance = 0

        val result = paymentValue(paymentSystem, payment, balance)
        assertEquals(965.0, result)
    }

    @Test
    fun comissionWorld(){
        val paymentSystem = "Мир"
        val payment = 1000
        val balance = 0

        val result = paymentValue(paymentSystem, payment, balance)
        assertEquals(965.0, result)
    }
    @Test
    fun comissionWorldAnother(){
        val paymentSystem = "Мир"
        val payment = 30000
        val balance = 0

        val result = paymentValue(paymentSystem, payment, balance)
        assertEquals(29775.0, result)
    }
    @Test
    fun comissionWrong(){
        val paymentSystem = "null"
        val payment = 10000
        val balance = 0
        val result = paymentValue(paymentSystem, payment, balance)
        assertEquals(0.0, result)
    }
}