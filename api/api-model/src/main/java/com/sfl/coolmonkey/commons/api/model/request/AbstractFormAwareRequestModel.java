package com.sfl.coolmonkey.commons.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sfl.coolmonkey.commons.api.model.ApiModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * User: Arthur Asatryan
 * Company: SFL LLC
 * Date: 12/16/15
 * Time: 9:42 AM
 */
public abstract class AbstractFormAwareRequestModel<T extends ApiModel> extends AbstractRequestModel {
    private static final long serialVersionUID = -6647531093336687871L;

    //region Properties
    @JsonProperty("companyUuid")
    private String companyUuid;

    @JsonProperty("form")
    private T form;
    //endregion

    //region Constructors
    public AbstractFormAwareRequestModel() {
    }

    public AbstractFormAwareRequestModel(final String companyUuid, final T form) {
        this.companyUuid = companyUuid;
        this.form = form;
    }
    //endregion

    //region Equals, HashCode and ToString
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractFormAwareRequestModel)) {
            return false;
        }
        final AbstractFormAwareRequestModel<?> that = (AbstractFormAwareRequestModel<?>) o;
        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(companyUuid, that.companyUuid)
                .append(form, that.form)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .appendSuper(super.hashCode())
                .append(companyUuid)
                .append(form)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("companyUuid", companyUuid)
                .append("form", form)
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

    public T getForm() {
        return form;
    }

    public void setForm(final T form) {
        this.form = form;
    }
    //endregion
}
