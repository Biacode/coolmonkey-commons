package com.sfl.coolmonkey.commons.queue.model.reporting;

import com.sfl.coolmonkey.commons.queue.model.common.AbstractAuthTokenAwareQueueModel;

/**
 * User: Arthur Asatryan
 * Company: SFL LLC
 * Date: 5/30/16
 * Time: 12:59 PM
 */
public class TimeTrackingUpdatedEvent extends AbstractAuthTokenAwareQueueModel {
    private static final long serialVersionUID = -5717651342101392414L;

    //region Properties
    //endregion

    //region Constructors
    public TimeTrackingUpdatedEvent() {
    }

    public TimeTrackingUpdatedEvent(final String authToken) {
        super(authToken);
    }
    //endregion

    //region Equals, HashCode and ToString
    //endregion

    //region Properties getters and setters
    //endregion
}
