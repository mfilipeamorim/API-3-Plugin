package api3

import grails.gorm.transactions.Transactional
import java.time.LocalDate

@Transactional
class LogService {
    def salvarLog(LocalDate data, String descricao) {
        def novoLog = new Log(data: data, descricao: descricao)
        novoLog.save(flush: true)
    }
}
