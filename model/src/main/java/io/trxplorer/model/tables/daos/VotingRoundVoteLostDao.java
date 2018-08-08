/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables.daos;


import io.trxplorer.model.tables.VotingRoundVoteLost;
import io.trxplorer.model.tables.records.VotingRoundVoteLostRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
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
public class VotingRoundVoteLostDao extends DAOImpl<VotingRoundVoteLostRecord, io.trxplorer.model.tables.pojos.VotingRoundVoteLost, ULong> {

    /**
     * Create a new VotingRoundVoteLostDao without any configuration
     */
    public VotingRoundVoteLostDao() {
        super(VotingRoundVoteLost.VOTING_ROUND_VOTE_LOST, io.trxplorer.model.tables.pojos.VotingRoundVoteLost.class);
    }

    /**
     * Create a new VotingRoundVoteLostDao with an attached configuration
     */
    public VotingRoundVoteLostDao(Configuration configuration) {
        super(VotingRoundVoteLost.VOTING_ROUND_VOTE_LOST, io.trxplorer.model.tables.pojos.VotingRoundVoteLost.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ULong getId(io.trxplorer.model.tables.pojos.VotingRoundVoteLost object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.VotingRoundVoteLost> fetchById(ULong... values) {
        return fetch(VotingRoundVoteLost.VOTING_ROUND_VOTE_LOST.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public io.trxplorer.model.tables.pojos.VotingRoundVoteLost fetchOneById(ULong value) {
        return fetchOne(VotingRoundVoteLost.VOTING_ROUND_VOTE_LOST.ID, value);
    }

    /**
     * Fetch records that have <code>voting_round_id IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.VotingRoundVoteLost> fetchByVotingRoundId(UInteger... values) {
        return fetch(VotingRoundVoteLost.VOTING_ROUND_VOTE_LOST.VOTING_ROUND_ID, values);
    }

    /**
     * Fetch records that have <code>owner_address IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.VotingRoundVoteLost> fetchByOwnerAddress(String... values) {
        return fetch(VotingRoundVoteLost.VOTING_ROUND_VOTE_LOST.OWNER_ADDRESS, values);
    }

    /**
     * Fetch records that have <code>vote_address IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.VotingRoundVoteLost> fetchByVoteAddress(String... values) {
        return fetch(VotingRoundVoteLost.VOTING_ROUND_VOTE_LOST.VOTE_ADDRESS, values);
    }

    /**
     * Fetch records that have <code>vote_count IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.VotingRoundVoteLost> fetchByVoteCount(ULong... values) {
        return fetch(VotingRoundVoteLost.VOTING_ROUND_VOTE_LOST.VOTE_COUNT, values);
    }

    /**
     * Fetch records that have <code>timestamp IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.VotingRoundVoteLost> fetchByTimestamp(Timestamp... values) {
        return fetch(VotingRoundVoteLost.VOTING_ROUND_VOTE_LOST.TIMESTAMP, values);
    }
}