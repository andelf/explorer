/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables.records;


import io.trxplorer.model.tables.SyncNode;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


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
public class SyncNodeRecord extends UpdatableRecordImpl<SyncNodeRecord> implements Record12<UInteger, Integer, String, Timestamp, Long, Long, Timestamp, Timestamp, Long, Long, Timestamp, Timestamp> {

    private static final long serialVersionUID = -49143692;

    /**
     * Setter for <code>tmp.sync_node.id</code>.
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>tmp.sync_node.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>tmp.sync_node.node_id</code>.
     */
    public void setNodeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>tmp.sync_node.node_id</code>.
     */
    public Integer getNodeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>tmp.sync_node.is_validating</code>.
     */
    public void setIsValidating(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>tmp.sync_node.is_validating</code>.
     */
    public String getIsValidating() {
        return (String) get(2);
    }

    /**
     * Setter for <code>tmp.sync_node.ping</code>.
     */
    public void setPing(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>tmp.sync_node.ping</code>.
     */
    public Timestamp getPing() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>tmp.sync_node.sync_start_full</code>.
     */
    public void setSyncStartFull(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>tmp.sync_node.sync_start_full</code>.
     */
    public Long getSyncStartFull() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>tmp.sync_node.sync_end_full</code>.
     */
    public void setSyncEndFull(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>tmp.sync_node.sync_end_full</code>.
     */
    public Long getSyncEndFull() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>tmp.sync_node.start_full_date</code>.
     */
    public void setStartFullDate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>tmp.sync_node.start_full_date</code>.
     */
    public Timestamp getStartFullDate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>tmp.sync_node.end_full_date</code>.
     */
    public void setEndFullDate(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>tmp.sync_node.end_full_date</code>.
     */
    public Timestamp getEndFullDate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>tmp.sync_node.sync_start_solidity</code>.
     */
    public void setSyncStartSolidity(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>tmp.sync_node.sync_start_solidity</code>.
     */
    public Long getSyncStartSolidity() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>tmp.sync_node.sync_end_solidity</code>.
     */
    public void setSyncEndSolidity(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>tmp.sync_node.sync_end_solidity</code>.
     */
    public Long getSyncEndSolidity() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>tmp.sync_node.start_solidity_date</code>.
     */
    public void setStartSolidityDate(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>tmp.sync_node.start_solidity_date</code>.
     */
    public Timestamp getStartSolidityDate() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>tmp.sync_node.end_solidity_date</code>.
     */
    public void setEndSolidityDate(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>tmp.sync_node.end_solidity_date</code>.
     */
    public Timestamp getEndSolidityDate() {
        return (Timestamp) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<UInteger, Integer, String, Timestamp, Long, Long, Timestamp, Timestamp, Long, Long, Timestamp, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<UInteger, Integer, String, Timestamp, Long, Long, Timestamp, Timestamp, Long, Long, Timestamp, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return SyncNode.SYNC_NODE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return SyncNode.SYNC_NODE.NODE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SyncNode.SYNC_NODE.IS_VALIDATING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return SyncNode.SYNC_NODE.PING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return SyncNode.SYNC_NODE.SYNC_START_FULL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return SyncNode.SYNC_NODE.SYNC_END_FULL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return SyncNode.SYNC_NODE.START_FULL_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return SyncNode.SYNC_NODE.END_FULL_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return SyncNode.SYNC_NODE.SYNC_START_SOLIDITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return SyncNode.SYNC_NODE.SYNC_END_SOLIDITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return SyncNode.SYNC_NODE.START_SOLIDITY_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return SyncNode.SYNC_NODE.END_SOLIDITY_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getNodeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getIsValidating();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getPing();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getSyncStartFull();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getSyncEndFull();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getStartFullDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getEndFullDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getSyncStartSolidity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getSyncEndSolidity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getStartSolidityDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getEndSolidityDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncNodeRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncNodeRecord value2(Integer value) {
        setNodeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncNodeRecord value3(String value) {
        setIsValidating(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncNodeRecord value4(Timestamp value) {
        setPing(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncNodeRecord value5(Long value) {
        setSyncStartFull(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncNodeRecord value6(Long value) {
        setSyncEndFull(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncNodeRecord value7(Timestamp value) {
        setStartFullDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncNodeRecord value8(Timestamp value) {
        setEndFullDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncNodeRecord value9(Long value) {
        setSyncStartSolidity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncNodeRecord value10(Long value) {
        setSyncEndSolidity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncNodeRecord value11(Timestamp value) {
        setStartSolidityDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncNodeRecord value12(Timestamp value) {
        setEndSolidityDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncNodeRecord values(UInteger value1, Integer value2, String value3, Timestamp value4, Long value5, Long value6, Timestamp value7, Timestamp value8, Long value9, Long value10, Timestamp value11, Timestamp value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SyncNodeRecord
     */
    public SyncNodeRecord() {
        super(SyncNode.SYNC_NODE);
    }

    /**
     * Create a detached, initialised SyncNodeRecord
     */
    public SyncNodeRecord(UInteger id, Integer nodeId, String isValidating, Timestamp ping, Long syncStartFull, Long syncEndFull, Timestamp startFullDate, Timestamp endFullDate, Long syncStartSolidity, Long syncEndSolidity, Timestamp startSolidityDate, Timestamp endSolidityDate) {
        super(SyncNode.SYNC_NODE);

        set(0, id);
        set(1, nodeId);
        set(2, isValidating);
        set(3, ping);
        set(4, syncStartFull);
        set(5, syncEndFull);
        set(6, startFullDate);
        set(7, endFullDate);
        set(8, syncStartSolidity);
        set(9, syncEndSolidity);
        set(10, startSolidityDate);
        set(11, endSolidityDate);
    }
}