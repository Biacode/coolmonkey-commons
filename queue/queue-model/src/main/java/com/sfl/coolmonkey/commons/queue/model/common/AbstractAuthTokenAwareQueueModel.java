package com.sfl.coolmonkey.commons.queue.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * User: Arthur Asatryan
 * Company: SFL LLC
 * Date: 5/30/16
 * Time: 12:56 PM
 */
public abstract class AbstractAuthTokenAwareQueueModel extends AbstractQueueModel {
    private static final long serialVersionUID = 8180630063340805471L;

    //region Properties
    @JsonProperty("authToken")
    private String authToken;
    //endregion

    //region Constructors
    public AbstractAuthTokenAwareQueueModel() {
    }

    public AbstractAuthTokenAwareQueueModel(final String authToken) {
        this.authToken = authToken;
    }
    //endregion

    //region Equals, HashCode and ToString
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractAuthTokenAwareQueueModel)) {
            return false;
        }
        final AbstractAuthTokenAwareQueueModel that = (AbstractAuthTokenAwareQueueModel) o;
        return new EqualsBuilder()
                .append(authToken, that.authToken)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(authToken)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("authToken", authToken)
                .toString();
    }
    //endregion

    //region Properties getters and setters
    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(final String authToken) {
        this.authToken = authToken;
    }
    //endregion
}
