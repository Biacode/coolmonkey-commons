package com.sfl.coolmonkey.commons.queue.model.reporting;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sfl.coolmonkey.commons.queue.model.common.AbstractQueueModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * User: Arthur Asatryan
 * Company: SFL LLC
 * Date: 6/17/16
 * Time: 5:15 PM
 */
public class AggregateKpiEvent extends AbstractQueueModel {
    private static final long serialVersionUID = 7272616525741404090L;

    //region Properties
    @JsonProperty("activityLogUuid")
    private String activityLogUuid;
    //endregion

    //region Constructors
    public AggregateKpiEvent() {
    }

    public AggregateKpiEvent(final String activityLogUuid) {
        this.activityLogUuid = activityLogUuid;
    }
    //endregion

    //region Equals, HashCode and ToString
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AggregateKpiEvent)) {
            return false;
        }
        final AggregateKpiEvent that = (AggregateKpiEvent) o;
        return new EqualsBuilder()
                .append(activityLogUuid, that.activityLogUuid)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(activityLogUuid)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("activityLogUuid", activityLogUuid)
                .toString();
    }
    //endregion

    //region Properties getters and setters
    public String getActivityLogUuid() {
        return activityLogUuid;
    }

    public void setActivityLogUuid(final String activityLogUuid) {
        this.activityLogUuid = activityLogUuid;
    }
    //endregion
}
