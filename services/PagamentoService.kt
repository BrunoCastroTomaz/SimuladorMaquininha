package services

import models.*
import utils.Taxas

object PagamentoService {
    fun realizarPagamento(
        cliente: Cliente,
        comerciante: Comerciante,
        valor: Double,
        tipoPagamento: TipoPagamento,
        parcelas: Int = 1
    ): Transacao {
        val taxa = Taxas.obterTaxa(tipoPagamento)
        val valorComTaxa = valor * (1 + taxa)

        return Transacao(
            cliente = cliente,
            comerciante = comerciante,
            valorOriginal = valor,
            tipoPagamento = tipoPagamento,
            valorComTaxa = valorComTaxa,
            parcelas = if (tipoPagamento == TipoPagamento.CREDITO) parcelas else 1
        )
    }
}
