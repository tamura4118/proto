package com.chavot.model.scenario;

public enum UserScene {
    TOP_MENU("0", "Menu", "TopMenu"),
    DEVICE_RANKING_LIST("1", "Product", "DeviceRankingList"),
    DEVICE_FREEWORD_INPUT("2", "Product", "DeviceFreeWordInput"),
    DEVICE_FREEWORD_SEARCH_RESULT("2", "Product", "DeviceFreeWordSearchResult"),
    ACCESSORY_RANKING_LIST("3", "Product", ""),
    ACCESSORY_FREEWORD_SEARCH_RESULT("4", "Product", ""),
    AFTER_CART_REGISTERED("5", "Cart", "");

    private String id;
    private String functionID;
    private String functionDetailID;

    UserScene(String id, String functionID, String functionDetailID) {
        this.id = id;
        this.functionID = functionID;
        this.functionDetailID = functionDetailID;
    }

}
