package com.chavot.model.botreply.define;

import java.util.Arrays;
import java.util.List;

public class Payload {
    boolean jsonFormat = false;
    List<String> values;

    public Payload (String payload) {
        this.values = Arrays.asList(payload);
    }

    public Payload (List<String> payloads) {
        this.values = payloads;
    }

    public List<String> getValues() {
        return values;
    }

    public String getValue() {
        return values.stream().findFirst().orElse("");
    }

    public boolean isJsonFormat() {
        return jsonFormat;
    }
}
