package com.sfl.coolmonkey.commons.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.ws.rs.QueryParam;

/**
 * User: Babken Vardanyan
 * Company: SFL LLC
 * Date: 3/11/16
 * Time: 7:01 PM
 */
public abstract class AbstractPaginationAwareRequestModel extends AbstractCompanyUuidAwareRequestModel {
    private static final long serialVersionUID = 8495650953590403260L;

    //region Properties
    @QueryParam("page")
    @JsonProperty("page")
    private int page;

    // The page size
    @QueryParam("limit")
    @JsonProperty("limit")
    private int size;

    @QueryParam("searchQuery")
    private String searchQuery;
    //endregion

    //region Constructors
    public AbstractPaginationAwareRequestModel() {
    }

    public AbstractPaginationAwareRequestModel(final int page, final int size) {
        this.page = page;
        this.size = size;
    }

    public AbstractPaginationAwareRequestModel(final int page, final int size, final String searchQuery) {
        this.page = page;
        this.size = size;
        this.searchQuery = searchQuery;
    }

    public AbstractPaginationAwareRequestModel(final String companyUuid, final int page, final int size, final String searchQuery) {
        super(companyUuid);
        this.page = page;
        this.size = size;
        this.searchQuery = searchQuery;
    }
    //endregion

    //region Equals, HashCode and ToString
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractPaginationAwareRequestModel)) {
            return false;
        }
        final AbstractPaginationAwareRequestModel that = (AbstractPaginationAwareRequestModel) o;
        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(page, that.page)
                .append(size, that.size)
                .append(searchQuery, that.searchQuery)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .appendSuper(super.hashCode())
                .append(page)
                .append(size)
                .append(searchQuery)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("page", page)
                .append("limit", size)
                .append("searchQuery", searchQuery)
                .toString();
    }
    //endregion

    //region Properties getters and setters
    public int getPage() {
        return page;
    }

    public void setPage(final int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(final int size) {
        this.size = size;
    }

    public String getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(final String searchQuery) {
        this.searchQuery = searchQuery;
    }
    //endregion
}
