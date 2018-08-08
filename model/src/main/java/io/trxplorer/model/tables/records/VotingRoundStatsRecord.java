/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables.records;


import io.trxplorer.model.tables.VotingRoundStats;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;
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
public class VotingRoundStatsRecord extends UpdatableRecordImpl<VotingRoundStatsRecord> implements Record6<UInteger, String, UInteger, ULong, UInteger, ULong> {

    private static final long serialVersionUID = 670269412;

    /**
     * Setter for <code>tmp.voting_round_stats.id</code>.
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>tmp.voting_round_stats.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>tmp.voting_round_stats.address</code>.
     */
    public void setAddress(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>tmp.voting_round_stats.address</code>.
     */
    public String getAddress() {
        return (String) get(1);
    }

    /**
     * Setter for <code>tmp.voting_round_stats.voting_round_id</code>.
     */
    public void setVotingRoundId(UInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>tmp.voting_round_stats.voting_round_id</code>.
     */
    public UInteger getVotingRoundId() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>tmp.voting_round_stats.vote_count</code>.
     */
    public void setVoteCount(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>tmp.voting_round_stats.vote_count</code>.
     */
    public ULong getVoteCount() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>tmp.voting_round_stats.position</code>.
     */
    public void setPosition(UInteger value) {
        set(4, value);
    }

    /**
     * Getter for <code>tmp.voting_round_stats.position</code>.
     */
    public UInteger getPosition() {
        return (UInteger) get(4);
    }

    /**
     * Setter for <code>tmp.voting_round_stats.vote_lost_count</code>.
     */
    public void setVoteLostCount(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>tmp.voting_round_stats.vote_lost_count</code>.
     */
    public ULong getVoteLostCount() {
        return (ULong) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UInteger, String, UInteger, ULong, UInteger, ULong> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UInteger, String, UInteger, ULong, UInteger, ULong> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return VotingRoundStats.VOTING_ROUND_STATS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return VotingRoundStats.VOTING_ROUND_STATS.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field3() {
        return VotingRoundStats.VOTING_ROUND_STATS.VOTING_ROUND_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return VotingRoundStats.VOTING_ROUND_STATS.VOTE_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field5() {
        return VotingRoundStats.VOTING_ROUND_STATS.POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return VotingRoundStats.VOTING_ROUND_STATS.VOTE_LOST_COUNT;
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
    public String value2() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value3() {
        return getVotingRoundId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getVoteCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value5() {
        return getPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getVoteLostCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VotingRoundStatsRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VotingRoundStatsRecord value2(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VotingRoundStatsRecord value3(UInteger value) {
        setVotingRoundId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VotingRoundStatsRecord value4(ULong value) {
        setVoteCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VotingRoundStatsRecord value5(UInteger value) {
        setPosition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VotingRoundStatsRecord value6(ULong value) {
        setVoteLostCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VotingRoundStatsRecord values(UInteger value1, String value2, UInteger value3, ULong value4, UInteger value5, ULong value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VotingRoundStatsRecord
     */
    public VotingRoundStatsRecord() {
        super(VotingRoundStats.VOTING_ROUND_STATS);
    }

    /**
     * Create a detached, initialised VotingRoundStatsRecord
     */
    public VotingRoundStatsRecord(UInteger id, String address, UInteger votingRoundId, ULong voteCount, UInteger position, ULong voteLostCount) {
        super(VotingRoundStats.VOTING_ROUND_STATS);

        set(0, id);
        set(1, address);
        set(2, votingRoundId);
        set(3, voteCount);
        set(4, position);
        set(5, voteLostCount);
    }
}