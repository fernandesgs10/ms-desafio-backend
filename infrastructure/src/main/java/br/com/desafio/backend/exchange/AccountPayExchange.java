package br.com.desafio.backend.exchange;

import br.com.desafio.backend.entity.AccountPaymentEntity;
import com.opencsv.exceptions.CsvException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.IOException;
import java.math.BigDecimal;

public interface AccountPayExchange {

    AccountPaymentEntity save(AccountPaymentEntity obj);

    AccountPaymentEntity update(AccountPaymentEntity obj);

    boolean remove(Long id);
    AccountPaymentEntity findUserById(Long id);

    Page<AccountPaymentEntity> findAll(Pageable pageable);

    Page<AccountPaymentEntity> findByDueDateAndDescription(Object[] objects);

    BigDecimal findSumAmountByPaymentDate(Object[] objects);

    boolean uploadCsv(Object obj[]) throws IOException, CsvException;



}
