package com.sfl.coolmonkey.commons.queue.model.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sfl.coolmonkey.commons.queue.model.common.AbstractQueueModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Map;

/**
 * User: Arthur Asatryan
 * Company: SFL LLC
 * Date: 9/16/16
 * Time: 12:39 PM
 */
public class UpdateAddressCreatedByUuidEvent extends AbstractQueueModel {
    private static final long serialVersionUID = 2770264863471947119L;

    //region Properties
    @JsonProperty("companyUuidToManagerUuid")
    private Map<String, String> companyUuidToManagerUuid;
    //endregion

    //region Constructors
    public UpdateAddressCreatedByUuidEvent() {
    }

    public UpdateAddressCreatedByUuidEvent(final Map<String, String> companyUuidToManagerUuid) {
        this.companyUuidToManagerUuid = companyUuidToManagerUuid;
    }
    //endregion

    //region Equals, HashCode and ToString
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAddressCreatedByUuidEvent)) {
            return false;
        }
        final UpdateAddressCreatedByUuidEvent that = (UpdateAddressCreatedByUuidEvent) o;
        return new EqualsBuilder()
                .append(companyUuidToManagerUuid, that.companyUuidToManagerUuid)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(companyUuidToManagerUuid)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("companyUuidToManagerUuid", companyUuidToManagerUuid)
                .toString();
    }
    //endregion

    //region Properties getters and setters
    public Map<String, String> getCompanyUuidToManagerUuid() {
        return companyUuidToManagerUuid;
    }

    public void setCompanyUuidToManagerUuid(final Map<String, String> companyUuidToManagerUuid) {
        this.companyUuidToManagerUuid = companyUuidToManagerUuid;
    }
    //endregion
}
