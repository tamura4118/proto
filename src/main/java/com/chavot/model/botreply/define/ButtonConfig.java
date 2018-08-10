package com.chavot.model.botreply.define;

public enum ButtonConfig {
    RANKING("ranking", "ランキングから探す", ButtonPayload.RANKING),
    FREEWORD("freeword", "フリーワード", ButtonPayload.FREEWORD),
    BACK_MENU("back.menu", "メニューへ戻る", ButtonPayload.BACK_MENU),
    PURCHASE("purchase", "購入する", ButtonPayload.PURCHASE);

    String key;
    String label;
    ButtonPayload payload;

    ButtonConfig(String key, String label, ButtonPayload payload) {
        this.key = key;
        this.label = label;
        this.payload = payload;
    }

    public String getKey() {
        return key;
    }

    public String getLabel() {
        return label;
    }

    public ButtonPayload getPayload() {
        return payload;
    }

    public boolean hasJsonPayload() {
        return payload.hasJsonKeyNames();
    }
}
