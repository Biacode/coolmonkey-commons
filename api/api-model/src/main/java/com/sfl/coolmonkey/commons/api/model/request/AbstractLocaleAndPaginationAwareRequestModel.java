package com.sfl.coolmonkey.commons.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.ws.rs.QueryParam;

/**
 * User: Arthur Asatryan
 * Company: SFL LLC
 * Date: 20/04/16
 * Time: 11:20
 */
public abstract class AbstractLocaleAndPaginationAwareRequestModel extends AbstractPaginationAwareRequestModel {
    private static final long serialVersionUID = -1491296693285275027L;

    //region Properties
    @QueryParam("locale")
    @JsonProperty("locale")
    private String locale;
    //endregion

    //region Constructors
    public AbstractLocaleAndPaginationAwareRequestModel() {
    }

    public AbstractLocaleAndPaginationAwareRequestModel(final int page, final int size, final String locale) {
        super(page, size);
        this.locale = locale;
    }

    public AbstractLocaleAndPaginationAwareRequestModel(final String companyUuid,
                                                        final int page,
                                                        final int size,
                                                        final String searchQuery,
                                                        final String locale) {
        super(companyUuid, page, size, searchQuery);
        this.locale = locale;
    }
    //endregion

    //region Equals, HashCode and ToString
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractLocaleAndPaginationAwareRequestModel)) {
            return false;
        }
        final AbstractLocaleAndPaginationAwareRequestModel that = (AbstractLocaleAndPaginationAwareRequestModel) o;
        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(locale, that.locale)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .appendSuper(super.hashCode())
                .append(locale)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("locale", locale)
                .toString();
    }
    //endregion

    //region Properties getters and setters
    public String getLocale() {
        return locale;
    }

    public void setLocale(final String locale) {
        this.locale = locale;
    }
    //endregion
}
