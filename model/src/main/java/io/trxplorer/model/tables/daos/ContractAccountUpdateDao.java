/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables.daos;


import io.trxplorer.model.tables.ContractAccountUpdate;
import io.trxplorer.model.tables.records.ContractAccountUpdateRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ContractAccountUpdateDao extends DAOImpl<ContractAccountUpdateRecord, io.trxplorer.model.tables.pojos.ContractAccountUpdate, ULong> {

    /**
     * Create a new ContractAccountUpdateDao without any configuration
     */
    public ContractAccountUpdateDao() {
        super(ContractAccountUpdate.CONTRACT_ACCOUNT_UPDATE, io.trxplorer.model.tables.pojos.ContractAccountUpdate.class);
    }

    /**
     * Create a new ContractAccountUpdateDao with an attached configuration
     */
    public ContractAccountUpdateDao(Configuration configuration) {
        super(ContractAccountUpdate.CONTRACT_ACCOUNT_UPDATE, io.trxplorer.model.tables.pojos.ContractAccountUpdate.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ULong getId(io.trxplorer.model.tables.pojos.ContractAccountUpdate object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAccountUpdate> fetchById(ULong... values) {
        return fetch(ContractAccountUpdate.CONTRACT_ACCOUNT_UPDATE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public io.trxplorer.model.tables.pojos.ContractAccountUpdate fetchOneById(ULong value) {
        return fetchOne(ContractAccountUpdate.CONTRACT_ACCOUNT_UPDATE.ID, value);
    }

    /**
     * Fetch records that have <code>account_name IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAccountUpdate> fetchByAccountName(String... values) {
        return fetch(ContractAccountUpdate.CONTRACT_ACCOUNT_UPDATE.ACCOUNT_NAME, values);
    }

    /**
     * Fetch records that have <code>owner_id IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAccountUpdate> fetchByOwnerId(ULong... values) {
        return fetch(ContractAccountUpdate.CONTRACT_ACCOUNT_UPDATE.OWNER_ID, values);
    }

    /**
     * Fetch records that have <code>transaction_id IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAccountUpdate> fetchByTransactionId(ULong... values) {
        return fetch(ContractAccountUpdate.CONTRACT_ACCOUNT_UPDATE.TRANSACTION_ID, values);
    }

    /**
     * Fetch records that have <code>owner_address IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAccountUpdate> fetchByOwnerAddress(String... values) {
        return fetch(ContractAccountUpdate.CONTRACT_ACCOUNT_UPDATE.OWNER_ADDRESS, values);
    }
}