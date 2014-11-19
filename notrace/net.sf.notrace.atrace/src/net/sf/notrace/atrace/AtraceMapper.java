package net.sf.notrace.atrace;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;

public class AtraceMapper extends ObjectMapper {

	private static final long serialVersionUID = 1L;

	public AtraceMapper() {
		super();
	}

	public AtraceMapper(JsonFactory jf) {
		super(jf);
	}

	public AtraceMapper(JsonFactory jf, DefaultSerializerProvider sp,
			DefaultDeserializationContext dc) {
		super(jf, sp, dc);
	}

	public AtraceMapper(ObjectMapper src) {
		super(src);
	}

}
