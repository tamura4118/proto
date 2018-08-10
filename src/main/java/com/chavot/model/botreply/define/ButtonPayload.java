package com.chavot.model.botreply.define;

import java.util.Arrays;
import java.util.List;

public enum ButtonPayload {
    RANKING,
    FREEWORD,
    BACK_MENU,
    PURCHASE(Arrays.asList("product_id", "display_name"));

    List<String> jsonKeyNames;

    ButtonPayload() {
    }
    ButtonPayload(List<String> jsonKeys) {
        this.jsonKeyNames = jsonKeys;
    }

    public List<String> getJsonKeyNames() {
        return jsonKeyNames;
    }

    public boolean hasJsonKeyNames() {
        return jsonKeyNames != null && !jsonKeyNames.isEmpty();
    }
}
