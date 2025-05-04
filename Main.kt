import models.*
import services.PagamentoService

fun main() {
    println("=== Simulador de Maquininha ===")

    val cliente = Cliente("João", "1234-5678-9012-3456")
    val comerciante = Comerciante("Padaria do Zé", "01.234.567/0001-89")
    val tipoPagamento = TipoPagamento.CREDITO
    val valor = 100.0
    val parcelas = 3

    val pagamento = PagamentoService.realizarPagamento(cliente, comerciante, valor, tipoPagamento, parcelas)

    println("Transação concluída:")
    println(pagamento)
}
