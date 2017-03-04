package com.sfl.coolmonkey.commons.queue.model.logging;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sfl.coolmonkey.commons.queue.model.common.AbstractAuthTokenAwareQueueModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * User: Arthur Asatryan
 * Company: SFL LLC
 * Date: 6/24/16
 * Time: 7:46 PM
 */
public class CreateActivityLogEvent extends AbstractAuthTokenAwareQueueModel {
    //region Properties
    @JsonProperty("companyUuid")
    private String companyUuid;

    @JsonProperty("operatorUuid")
    private String operatorUuid;

    @JsonProperty("type")
    private ParentActivityTypeEventModel type;

    @JsonProperty("operatorType")
    private OperatorTypeEventModel operatorType;
    //endregion

    //region Constructors
    public CreateActivityLogEvent() {
    }

    public CreateActivityLogEvent(final String companyUuid,
                                  final String operatorUuid,
                                  final ParentActivityTypeEventModel type,
                                  final OperatorTypeEventModel operatorType) {
        this.companyUuid = companyUuid;
        this.operatorUuid = operatorUuid;
        this.type = type;
        this.operatorType = operatorType;
    }
    //endregion

    //region Equals, HashCode and ToString
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateActivityLogEvent)) {
            return false;
        }
        final CreateActivityLogEvent that = (CreateActivityLogEvent) o;
        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(companyUuid, that.companyUuid)
                .append(operatorUuid, that.operatorUuid)
                .append(type, that.type)
                .append(operatorType, that.operatorType)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .appendSuper(super.hashCode())
                .append(companyUuid)
                .append(operatorUuid)
                .append(type)
                .append(operatorType)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("companyUuid", companyUuid)
                .append("operatorUuid", operatorUuid)
                .append("type", type)
                .append("operatorType", operatorType)
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

    public String getOperatorUuid() {
        return operatorUuid;
    }

    public void setOperatorUuid(final String operatorUuid) {
        this.operatorUuid = operatorUuid;
    }

    public ParentActivityTypeEventModel getType() {
        return type;
    }

    public void setType(final ParentActivityTypeEventModel type) {
        this.type = type;
    }

    public OperatorTypeEventModel getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(final OperatorTypeEventModel operatorType) {
        this.operatorType = operatorType;
    }
    //endregion
}
