package com.sfl.coolmonkey.commons.api.model.response;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.sfl.coolmonkey.commons.api.model.CommonErrorType;

import java.io.IOException;
import java.util.List;

/**
 * User: Babken Vardanyan
 * Company: SFL LLC
 * Date: 12/3/15
 * Time: 11:43 AM
 */
public class CommonErrorTypeListSerializer extends JsonSerializer<List<CommonErrorType>> {

    //region Constructors
    public CommonErrorTypeListSerializer() {
    }
    //endregion

    //region Public methods
    @Override
    public void serialize(final List<CommonErrorType> value, final JsonGenerator gen, final SerializerProvider serializers) throws IOException {
        gen.writeStartObject();
        if (value != null) {
            for (final CommonErrorType commonErrorType : value) {
                gen.writeObjectField(String.valueOf(commonErrorType.ordinal()), String.valueOf(commonErrorType));
            }
        }
        gen.writeEndObject();
    }
    //endregion
}
