package com.sfl.coolmonkey.commons.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sfl.coolmonkey.commons.api.model.ApiModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * User: Ruben Vardanyan
 * Company: SFL LLC
 * Date: 3/22/16
 * Time: 10:24 AM
 */
public abstract class AbstractPaginationAwareResponseModel<T extends ApiModel> extends AbstractGridAwareResponseModel<T> {
    private static final long serialVersionUID = -4090258663000995189L;

    //region Properties
    @JsonProperty("totalCount")
    private long totalCount;
    //endregion

    //region Constructors
    public AbstractPaginationAwareResponseModel() {
    }

    public AbstractPaginationAwareResponseModel(final List<T> grid, final long totalCount) {
        super(grid);
        this.totalCount = totalCount;
    }
    //endregion

    //region Equals, HashCode and ToString
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractPaginationAwareResponseModel)) {
            return false;
        }
        final AbstractPaginationAwareResponseModel<?> that = (AbstractPaginationAwareResponseModel<?>) o;
        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(totalCount, that.totalCount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .appendSuper(super.hashCode())
                .append(totalCount)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("totalCount", totalCount)
                .toString();
    }
    //endregion

    //region Properties getters and setters
    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(final long totalCount) {
        this.totalCount = totalCount;
    }
    //endregion
}
