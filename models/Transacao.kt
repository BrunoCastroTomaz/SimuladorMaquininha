package models

data class Transacao(
    val cliente: Cliente,
    val comerciante: Comerciante,
    val valorOriginal: Double,
    val tipoPagamento: TipoPagamento,
    val valorComTaxa: Double,
    val parcelas: Int
)
