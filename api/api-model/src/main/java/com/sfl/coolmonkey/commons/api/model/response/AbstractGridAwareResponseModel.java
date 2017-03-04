package com.sfl.coolmonkey.commons.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sfl.coolmonkey.commons.api.model.ApiModel;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * User: Arthur Asatryan
 * Company: SFL LLC
 * Date: 11/12/15
 * Time: 4:18 PM
 */
public abstract class AbstractGridAwareResponseModel<T extends ApiModel> extends AbstractResponseModel {
    private static final long serialVersionUID = 250706890860727207L;

    //region Properties
    @JsonProperty("grid")
    private List<T> grid;
    //endregion

    //region Constructors
    public AbstractGridAwareResponseModel() {
    }

    public AbstractGridAwareResponseModel(final List<T> grid) {
        this.grid = grid;
    }
    //endregion

    //region Equals, HashCode and ToString
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractGridAwareResponseModel)) {
            return false;
        }
        final AbstractGridAwareResponseModel that = (AbstractGridAwareResponseModel) o;
        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(grid, that.grid)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .appendSuper(super.hashCode())
                .append(grid)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("grid", grid)
                .toString();
    }
    //endregion

    //region Properties getters and setters
    public List<T> getGrid() {
        return grid;
    }

    public void setGrid(final List<T> grid) {
        this.grid = grid;
    }
    //endregion
}