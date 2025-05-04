package utils

import models.TipoPagamento

object Taxas {
    fun obterTaxa(tipo: TipoPagamento): Double {
        return when (tipo) {
            TipoPagamento.CREDITO -> 0.05 // 5%
            TipoPagamento.DEBITO -> 0.02 // 2%
        }
    }
}
