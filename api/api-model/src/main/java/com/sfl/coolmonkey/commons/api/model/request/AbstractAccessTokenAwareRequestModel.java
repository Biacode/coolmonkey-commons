package com.sfl.coolmonkey.commons.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.ws.rs.QueryParam;

/**
 * User: Syuzanna Eprikyan
 * Company: SFL LLC
 * Date: 1/31/17
 * Time: 3:30 PM
 */
public abstract class AbstractAccessTokenAwareRequestModel extends AbstractRequestModel {
    private static final long serialVersionUID = -926461203403791876L;

    //region Properties
    @QueryParam("accessToken")
    @JsonProperty("accessToken")
    private String accessToken;
    //endregion

    //region Constructors
    public AbstractAccessTokenAwareRequestModel() {
    }

    public AbstractAccessTokenAwareRequestModel(final String accessToken) {
        this.accessToken = accessToken;
    }
    //endregion

    //region Equals, HashCode and ToString
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractAccessTokenAwareRequestModel)) {
            return false;
        }
        final AbstractAccessTokenAwareRequestModel that = (AbstractAccessTokenAwareRequestModel) o;
        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(accessToken, that.accessToken)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .appendSuper(super.hashCode())
                .append(accessToken)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("accessToken", accessToken)
                .toString();
    }
    //endregion

    //region Properties getters and setters
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(final String accessToken) {
        this.accessToken = accessToken;
    }
    //endregion


}
