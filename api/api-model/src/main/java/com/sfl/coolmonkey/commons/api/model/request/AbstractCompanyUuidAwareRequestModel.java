package com.sfl.coolmonkey.commons.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.ws.rs.QueryParam;

/**
 * User: Babken Vardanyan
 * Company: SFL LLC
 * Date: 10/29/15
 * Time: 2:00 PM
 */
public abstract class AbstractCompanyUuidAwareRequestModel extends AbstractRequestModel {
    private static final long serialVersionUID = -925461203403791876L;

    //region Properties
    @QueryParam("companyUuid")
    @JsonProperty("companyUuid")
    private String companyUuid;
    //endregion

    //region Constructors
    public AbstractCompanyUuidAwareRequestModel() {
    }

    public AbstractCompanyUuidAwareRequestModel(final String companyUuid) {
        this.companyUuid = companyUuid;
    }
    //endregion

    //region Equals, HashCode and ToString
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractCompanyUuidAwareRequestModel)) {
            return false;
        }
        final AbstractCompanyUuidAwareRequestModel that = (AbstractCompanyUuidAwareRequestModel) o;
        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(companyUuid, that.companyUuid)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .appendSuper(super.hashCode())
                .append(companyUuid)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("companyUuid", companyUuid)
                .toString();
    }
    //endregion

    //region Properties getters and setters
    public String getCompanyUuid() {
        return companyUuid;
    }

    public void setCompanyUuid(final String companyUuid) {
        this.companyUuid = companyUuid;
    }
    //endregion
}
