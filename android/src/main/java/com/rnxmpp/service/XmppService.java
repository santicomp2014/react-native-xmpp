package com.rnxmpp.service;

import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;

/**
 * Created by Kristian Frølund on 7/19/16.
 * Copyright (c) 2016. Teletronics. All rights reserved
 */

public interface XmppService {

    @ReactMethod
    public void trustHosts(ReadableArray trustedHosts);

    @ReactMethod
    void connect(String jid, String password, String authMethod, String hostname, Integer port);

    @ReactMethod
    void joinRoom(String mucJid, String userNickname,String lastMessage);

    @ReactMethod
    void sendRoomMessage(String roomJid, String text);

    @ReactMethod
    void sendRoomMessageUpdated(String roomJid, String text,String messageId);

    @ReactMethod
    void leaveRoom(String mucJid);

    @ReactMethod
    void message(String text, String to, String thread);

    @ReactMethod
    void messageUpdated(String text, String to, String thread,String messageId);


    @ReactMethod
    void presence(String to, String type);

    @ReactMethod
    void removeRoster(String to);

    @ReactMethod
    void disconnect();

    @ReactMethod
    void fetchRoster();

    @ReactMethod
    void sendStanza(String stanza);

    @ReactMethod
    void createRoasterEntry(String jabberId,String name);

    @ReactMethod
    void sendComposingState(String to, String thread,String state);

    @ReactMethod
    void requestMessageId();

}
